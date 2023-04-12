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

namespace WinForm_KaoShi
{
    public partial class Frm_ChaXun : Form
    {
        static string str = "Data Source=.;Initial Catalog=AirQualityDB;Integrated Security=True";
        SqlConnection conn = new SqlConnection(str);
        SqlCommand comm;
        DataSet ds = new DataSet();
        SqlDataAdapter da;
        string sql = "";

        public Frm_ChaXun()
        {
            InitializeComponent();
        }
        //退出按钮
        private void btnGuanBi_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
        
        private void Frm_ChaXun_Load(object sender, EventArgs e)
        {
            
            xianShi();
        }
        
        public void xianShi() 
        {
            try
            {
                conn.Open();
                string sql = @"select [dbo].[StationInfo].StationName,[InputName],[StartDate],[EndDate],[PM],[Level],[Notes] from [dbo].[AirQuAlityInfo]
                             inner join [dbo].[StationInfo] on [dbo].[StationInfo].StationID = [dbo].[AirQuAlityInfo].StationID";
                da = new SqlDataAdapter(sql, conn);
                da.Fill(ds, "XianShi");
                this.dataGridView1.DataSource = ds.Tables["XianShi"];
                conn.Close();
            }
            catch (Exception)
            {
                MessageBox.Show("出现异常，联系管理员");
            }


        }

        private void btnQuXiao_Click(object sender, EventArgs e)
        {
            
            ds.Tables["XianShi"].Clear();
            string ren = this.txtLuRuRenYuan.Text;
            conn.Open();
            string sql = @"select [dbo].[StationInfo].StationName,[InputName],[StartDate],[EndDate],[PM],[Level],[Notes] from [dbo].[AirQuAlityInfo]" +
                         "inner join [dbo].[StationInfo] on [dbo].[StationInfo].StationID = [dbo].[AirQuAlityInfo].StationID" +
                         "where [InputName] like '%" + ren + "%'";
            da = new SqlDataAdapter(sql, conn);
            da.Fill(ds, "XianShi");
            this.dataGridView1.DataSource = ds.Tables["XianShi"];
            conn.Close();
        
            
        }
    }
}
