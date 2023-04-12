using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinForm_lx
{
    public partial class YuDingHuiYi : Form
    {
        static string str = "Data Source=.;Initial Catalog=BoardScheduleManager;Integrated Security=True";
       SqlConnection conn = new SqlConnection(str);
        SqlCommand comm;
        SqlDataAdapter da;
        DataSet ds = new DataSet();
        string sql = "";

        public YuDingHuiYi()
        {
            InitializeComponent();
        }

        public void BingCbo() 
        {
            try
            {
                sql = "select id,[boardrommID],[intendedName],[startTime],[duration],[enterintName],[reason] from [dbo].[ScheduleInfo]";
                da = new SqlDataAdapter(sql, conn);
                da.Fill(ds, "a");
                this.comboBox1.DataSource = ds.Tables["a"];
                this.comboBox1.DisplayMember = "boardrommID";
                this.comboBox1.ValueMember = "id";
            }
            catch (Exception)
            {
                MessageBox.Show("出现异常，请联系管理员");
            }
        }
      
        private void lblYuDingShiChang_Click(object sender, EventArgs e)
        {
            
        }

        private void btuExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void YuDingHuiYi_Load(object sender, EventArgs e)
        {
            BingCbo();

        }

        private void btnQingKong_Click(object sender, EventArgs e)
        {
            txtLuRuName.Clear();
            txtName.Clear();
            txtShiChang.Clear();
            txtTime.Clear();
            txtYuanYin.Clear();
        }

        private void btnBaoCun_Click(object sender, EventArgs e)
        {
            Boolean a;
            foreach (Control control in Controls) 
            {
                //判断控件是否是文本框
                if (control is System.Windows.Forms.TextBox) 
                {
                    //判断文本框是否为空
                    if (control.Text.Equals(String.Empty))
                    {
                        MessageBox.Show("信息不完整", "警告", MessageBoxButtons.OK, MessageBoxIcon.Error);
                        txtLuRuName.Clear();
                        txtName.Clear();
                        txtShiChang.Clear();
                        txtTime.Clear();
                        txtYuanYin.Clear();
                        a = false;
                        break;
                    }
                    else
                    {
                        try
                        {
       
                        }
                        catch (Exception)
                        {
                            MessageBox.Show("出现异常，请联系管理员");
                        }
                        a = true;

                        int id = Convert.ToInt32(comboBox1.SelectedValue);
                        string name = this.txtName.Text;
                        string time = this.txtTime.Text;
                        string shiChang = this.txtShiChang.Text;
                        string luRuName = this.txtLuRuName.Text;
                        string yuanYin = this.txtYuanYin.Text;

                        conn.Open();
                        sql = "insert into [dbo].[ScheduleInfo] ([boardrommID],[intendedName],[startTime],[duration],[enterintName],[reason])" +
                            "values('" + id + "','" + name + "','" + time + "','" + shiChang + "','" + luRuName + "','" + yuanYin + "')";

                        comm = new SqlCommand(sql,conn);
                        int i = comm.ExecuteNonQuery();
                        if (i > 0)
                        {
                            MessageBox.Show("添加成功");
                        }
                        else
                        {
                            MessageBox.Show("添加失败");
                        }
                        conn.Close();
                        break;
                    }
                }
            }           
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
        }
    }
}
