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

namespace WinForm_MNT01
{
    public partial class ChaXunYuDing : Form
    {
        static string str = "Data Source=SEQQ;Initial Catalog=BoardScheduleManager;Integrated Security=True";
        SqlConnection conn = new SqlConnection(str);
        SqlCommand comm;
        SqlDataAdapter da;
        DataSet ds = new DataSet();

        public ChaXunYuDing()
        {
            InitializeComponent();
        }

        public void Bing() 
        {
            try
            {
                conn.Open();
                string sql = @"select ScheduleInfo.id,[dbo].[BoardrommInfo].boardName,intendedName,startTime,duration,enterintName,reason from ScheduleInfo
                                    inner join BoardrommInfo on ScheduleInfo.boardrommID=[dbo].[BoardrommInfo].id";
                da = new SqlDataAdapter(sql, conn);
                da.Fill(ds, "XianShi");
                this.dataGridView1.DataSource = ds.Tables["XianShi"];
                conn.Close();
            }
            catch (Exception)
            {
                MessageBox.Show("出现异常，请拨打110");
            }

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
           
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void ChaXunYuDing_Load(object sender, EventArgs e)
        {
            Bing();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ds.Tables["XianShi"].Clear();
            string name = this.textBox1.Text;
            conn.Open();
            string sql = "select ScheduleInfo.id,[dbo].[BoardrommInfo].boardName,[intendedName],[startTime],[duration],[enterintName],[reason] from [dbo].[ScheduleInfo]" +
                "inner join [dbo].[BoardrommInfo] on [dbo].[ScheduleInfo].[boardrommID] = [dbo].[BoardrommInfo].[id]" +
                "where [intendedName] like '%"+name+"%'";
            da = new SqlDataAdapter(sql,conn);
            da.Fill(ds,"XianShi");
            this.dataGridView1.DataSource = ds.Tables["XianShi"];
            conn.Close() ;
        }
    }
}
