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
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace WinForm_MNT01
{
    public partial class textXingMing : Form
    {
        static string str = "Data Source=SEQQ;Initial Catalog=BoardScheduleManager;Integrated Security=True";
        SqlConnection conn = new SqlConnection(str);
        SqlDataAdapter da;//货车
        DataSet set = new DataSet();//临时仓库
        string sql = "";
        SqlCommand comm;

        public textXingMing()
        {
            InitializeComponent();
        }

        //下拉列表
        private void YuDingHuiYi_Load(object sender, EventArgs e)
        {
            BingCbo();
        }

        public void BingCbo() {
            try
            {
                sql = "select id,boardrommID,intendedname,[startTime],[duration],[enterintName],[reason] from ScheduleInfo;";
                da = new SqlDataAdapter(sql,conn);
                da.Fill(set, "a");
                this.comboBox1.DataSource = set.Tables["a"];
                this.comboBox1.DisplayMember = "boardName";
                this.comboBox1.ValueMember = "id";
            }
            catch (Exception)
            {
                MessageBox.Show("出现异常，请拨打110");
            }
        }

        //清空按钮
        private void button2_Click(object sender, EventArgs e)
        {
            textName.Clear();
            textTime.Clear();
            textXiaoShi.Clear();
            textLuRuRenXingMing.Clear();
            textYuanYin.Clear();
        }

        //关闭按钮
        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        //保存
        private void button1_Click(object sender, EventArgs e)
        {
            Boolean iss;
            foreach (Control control in Controls)
            {
                //判断控件是否是文本框
                if (control is System.Windows.Forms.TextBox)
                {
                    //判断文本框为空
                    if (control.Text.Equals(String.Empty))
                    {
                        MessageBox.Show("信息不完整", "警告", MessageBoxButtons.OK, MessageBoxIcon.Error);
                        textName.Clear();
                        textTime.Clear();
                        textXiaoShi.Clear();
                        textLuRuRenXingMing.Clear();
                        textYuanYin.Clear();
                        iss = false;
                        break;
                    }
                    else 
                    {
                        try
                        {
                            iss = true;
                            int yuDingName = Convert.ToInt32(comboBox1.SelectedValue);
                            string luRuXingMing = this.textName.Text;
                            string yuJiShiJian = this.textTime.Text;
                            string yuDingShiChang = this.textXiaoShi.Text;
                            string luRuRenXingMing = this.textLuRuRenXingMing.Text;
                            string yuanYin = this.textYuanYin.Text;

                            conn.Open();
                            sql = "insert into [dbo].[ScheduleInfo] ([boardrommID],[intendedName],[startTime],[duration],[enterintName],[reason]) " +
                                "values ('" + yuDingName + "','" + luRuRenXingMing + "','" + yuJiShiJian + "','" + yuDingShiChang + "','" + luRuRenXingMing + "','" + yuanYin + "')";

                            comm = new SqlCommand(sql, conn);
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
                        }
                        catch (Exception)
                        {
                            MessageBox.Show("出现异常，请拨打110");
                        }
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
