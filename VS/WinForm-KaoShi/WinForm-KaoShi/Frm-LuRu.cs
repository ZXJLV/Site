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
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace WinForm_KaoShi
{
    public partial class Frm_LuRu : Form
    {
        static string str = "Data Source=.;Initial Catalog=AirQualityDB;Integrated Security=True";
        SqlConnection conn = new SqlConnection(str);
        SqlCommand comm;
        DataSet ds = new DataSet();
        SqlDataAdapter da;
        string sql = "";

        public Frm_LuRu()
        {
            InitializeComponent();
        }
        //退出按钮
        private void btoExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
        //下拉框
        private void Frm_LuRu_Load(object sender, EventArgs e)
        {
            //调用下拉框方法
            BingXiaLa();
        }
        //下拉框方法
        public void BingXiaLa() 
        {
            try
            {
                conn.Open();
                sql = "select [StationID],[StationName] from [dbo].[StationInfo]";
                da = new SqlDataAdapter(sql, conn);
                da.Fill(ds, "JianCe");
                this.cboJianCe.DataSource = ds.Tables["JianCe"];
                this.cboJianCe.DisplayMember = "StationName";
                this.cboJianCe.ValueMember = "StationID";
                conn.Close();
            }
            catch (Exception)
            {
                MessageBox.Show("出现异常，请联系管理员");
            }
        }
        //清空按钮
        private void btoQingKong_Click(object sender, EventArgs e)
        {
            this.cboJianCe.Text = "";
            this.txtLuRuRen.Text = "";
            this.txtKaiShiTime.Text = "";
            this.txtKongQiDengJi.Text = "";
            this.txtPM.Text = "";
            this.txtTingZhiTime.Text = "";
            this.txtZhuYi.Text = "";
        }
        //保存
        private void btoTiJiao_Click(object sender, EventArgs e)
        {
            Boolean a;
            foreach (Control control in Controls)
            {
                //判断控件是否是文本框
                if (control is System.Windows.Forms.TextBox)
                {
                    //判断文本框为空
                    if (control.Text.Equals(String.Empty))
                    {
                        MessageBox.Show("所有信息均不能为空，请完善！", "操作提示", MessageBoxButtons.OK, MessageBoxIcon.Error);
                        this.cboJianCe.Text = "";
                        this.txtLuRuRen.Text = "";
                        this.txtKaiShiTime.Text = "";
                        this.txtKongQiDengJi.Text = "";
                        this.txtPM.Text = "";
                        this.txtTingZhiTime.Text = "";
                        this.txtZhuYi.Text = "";
                        a = false;
                        break;
                    }
                    else
                    {
                        try
                        {
                            a = true;
                            int jianCe = Convert.ToInt32(cboJianCe.SelectedValue);
                            string luRu = this.txtLuRuRen.Text;
                            string kaiShiTime = this.txtKaiShiTime.Text;
                            string tingZhiTime = this.txtTingZhiTime.Text;
                            string pm = this.txtPM.Text;
                            string dengJi = this.txtKongQiDengJi.Text;
                            string zhuYi = this.txtZhuYi.Text;

                            conn.Open();
                            sql = "insert into [dbo].[AirQuAlityInfo] ([StationID],[InputName],[StartDate],[EndDate],[PM],[Level],[Notes])" +
                                  "values('"+ jianCe + "','"+ luRu + "','"+ kaiShiTime + "','"+ tingZhiTime + "','"+ pm + "','"+ dengJi + "','"+ zhuYi + "')";

                            comm = new SqlCommand(sql, conn);
                            int i = comm.ExecuteNonQuery();
                            if (i > 0)
                            {
                                MessageBox.Show("数据已经成功保存", "操作提示", MessageBoxButtons.OK, MessageBoxIcon.Error);
                            }
                            else
                            {
                                MessageBox.Show("数据保存失败", "操作提示", MessageBoxButtons.OK, MessageBoxIcon.Error);
                            }
                            conn.Close();
                        }
                        catch (Exception)
                        {
                            MessageBox.Show("出现异常，请联系管理员");
                        }
                        break;



                    }


                }
            }
        }
    }
}
