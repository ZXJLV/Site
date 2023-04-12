using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinForm_KaoShi
{
    public partial class frmMain : Form
    {
        public frmMain()
        {
            InitializeComponent();
        }
        //打开录入监测数据窗口
        private void 录入监测数据ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Frm_LuRu fl = new Frm_LuRu();
            fl.Show();
        }
        //查询监测结果窗口
        private void 查询监测结果ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Frm_ChaXun fc = new Frm_ChaXun();
            fc.Show();
        }
        //退出按钮
        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
