using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFA1
{
    public partial class frmMain : Form
    {

        public frmMain()
        {
            InitializeComponent();


        }

        private void frmMain_Load(object sender, EventArgs e)
        {

        }

        private void 录入监测数据ToolStripMenuItem_Click_1(object sender, EventArgs e)
        {
            luRu l = new luRu();
            l.Show();

        }

        private void 查询监测ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            chaXun c = new chaXun();
            c.Show();
        }

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
