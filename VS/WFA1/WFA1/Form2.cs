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

namespace WFA1
{
    public partial class luRu : Form
    {
        public static string str = "Data Source=SEQQ;Initial Catalog=BoardScheduleManager;Integrated Security=True";

        SqlConnection conn = new SqlConnection(str);
        static string sql;
        SqlCommand comm;
        SqlDataAdapter da;
        DataSet set = new DataSet();

        public luRu()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox2.Clear();
            textBox3.Clear();
            textBox4.Clear();
            textBox5.Clear();
            textBox6.Clear();
            textBox7.Clear();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();

        }

        public void xiaLa() {

            conn.Open();

            sql = "select StationID,StationName from StationInfo;";
            da = new SqlDataAdapter(sql, conn);

            da.Fill(set, "a");
            this.comboBox1.DataSource = set.Tables["a"];
            this.comboBox1.DisplayMember = "StationName";
            this.comboBox1.ValueMember = "StctionID";

            conn.Close();

        }

        private void luRu_Load(object sender, EventArgs e)
        {
            xiaLa();
           
           
        }
    }
}
