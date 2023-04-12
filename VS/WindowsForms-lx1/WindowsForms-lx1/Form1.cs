using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Data;
using System.Security.Policy;
using System.Data.Sql;
using System.Data.Common;
using System.Runtime.CompilerServices;

namespace WindowsForms_lx1
{
    public partial class ChaoShiHuiYuan : Form
    {
        static string str = "Data Source=.;Initial Catalog=SuperMark;Integrated Security=True";
        SqlConnection conn = new SqlConnection(str);
        SqlCommand comm;
        SqlDataReader reader;
        SqlDataAdapter da;
        DataSet ds = new DataSet();
        DataRow row;
        string type;
        int jiFen = 0;

        public ChaoShiHuiYuan()
        {
            InitializeComponent();
        }

        private void cboZhuangTai_SelectedIndexChanged(object sender, EventArgs e)
        {
        }

        private void ChaoShiHuiYuan_Load(object sender, EventArgs e)
        {
            xinXi();
            BingCboZhuangTai2();
            this.cboZhuangTai.SelectedIndex = 0;
        }

        public void BingCboZhuangTai1()
        {
            conn.Open();
            string sql = "select id,StartesName from [dbo].[States];";
            comm = new SqlCommand(sql, conn);
            reader = comm.ExecuteReader();

            while (reader.Read())
            {
                this.cboZhuangTai.Items.Add(reader["StartesName"]);
            }

            reader.Close();
            conn.Close();

        }


        public void BingCboZhuangTai2()
        {
            conn.Open();
            string sql = "select id,StartesName from [dbo].[States];";
            da = new SqlDataAdapter(sql, conn);
            da.Fill(ds, "shuJu");
            DataRow row = ds.Tables["shuJu"].NewRow();
            row["id"] = -1;
            row["StartesName"] = "请选择";
            ds.Tables["shuJu"].Rows.InsertAt(row, 0);
            this.cboZhuangTai.DataSource = ds.Tables["shuJu"];
            this.cboZhuangTai.ValueMember = "Id";
            this.cboZhuangTai.DisplayMember = "StartesName";
            conn.Close();
        }

        private void rdoJIn_CheckedChanged(object sender, EventArgs e)
        {
            if (this.rdoJIn.Checked)
            {
                this.txtJiFen.Text = "500";
                type = "金卡";
                jiFen = 500;
            }
        }

        private void rdoBoJin_CheckedChanged(object sender, EventArgs e)
        {
            if (this.rdoBoJin.Checked)
            {
                this.txtJiFen.Text = "2000";
                type = "铂金卡";
                jiFen = 2000;
            }
        }

        private void rdoZuanShi_CheckedChanged(object sender, EventArgs e)
        {
            if (this.rdoZuanShi.Checked)
            {
                this.txtJiFen.Text = "5000";
                type = "钻石卡";
                jiFen = 5000;
            }
        }

        private void btoTianJia_Click(object sender, EventArgs e)
        {
            if (yanZhengFeiKong())
            {
                string zhangHao = this.txtZhangHao.Text;
                string password = this.txtPwd.Text;
                int zhuangTai = Convert.ToInt32(this.cboZhuangTai.SelectedValue);
                conn.Open();
                string sql = "insert into [dbo].[UserInfo] ([CustomeId],[CustomePassword],[CustomeType],[Score],[statesId]) " +
                             "values ('"+zhangHao+"','"+password+"','"+type+"',"+jiFen+","+zhuangTai+")";
                comm = new SqlCommand(sql, conn);
                int a = comm.ExecuteNonQuery();

                if (a > 0)
                {
                    conn.Close();
                    MessageBox.Show("添加成功");
                    xinXi();
                }
                else 
                {
                    MessageBox.Show("添加失败");
                }
                conn.Close();
            }
        }

        public bool yanZhengFeiKong()
        {
            bool ok = true;
            foreach (Control control in this.Controls ) 
            {
                if (control is TextBox) 
                {
                    if (((TextBox)control).Text.Length == 0) 
                    {
                        MessageBox.Show("信息不完整");
                        ok = false;
                        break;
                    }
                }
            }
            return ok;
         
        }

        public void xinXi() 
        {
            if (ds.Tables["users"]!=null) 
            {
                ds.Tables["users"].Rows.Clear();
            }

            conn.Open();    
            string sql = "select [dbo].[UserInfo].[Id],[CustomeId],[CustomeType],[Score],[StartesName] from [dbo].[UserInfo]\r\ninner join [dbo].[States] on [dbo].[UserInfo].[statesId] = [dbo].[States].id";
            da = new SqlDataAdapter(sql,conn);
            da.Fill(ds,"users");
            this.dataGridView1.DataSource = ds.Tables["users"];
            conn.Close();
        
        }


    }
}
