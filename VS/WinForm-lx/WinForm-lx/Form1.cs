using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinForm_lx
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void 退出系统ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void 预订会议室ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            YuDingHuiYi ydhy = new YuDingHuiYi();
            ydhy.MdiParent= this;
            ydhy.Show();
        }

        private void MainForm_Load(object sender, EventArgs e)
        {

        }

        private void 查询预订情况ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ChaXunYuDing cxyd = new ChaXunYuDing();
            cxyd.MdiParent = this;
            cxyd.Show();
        }
    }
}
