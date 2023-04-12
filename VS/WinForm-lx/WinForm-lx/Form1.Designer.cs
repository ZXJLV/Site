namespace WinForm_lx
{
    partial class MainForm
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要修改
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.会议室管理ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.预订会议室ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.查询预订情况ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.会议纪要管理ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.退出系统ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(18, 18);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.会议室管理ToolStripMenuItem,
            this.会议纪要管理ToolStripMenuItem,
            this.退出系统ToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(655, 28);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // 会议室管理ToolStripMenuItem
            // 
            this.会议室管理ToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.预订会议室ToolStripMenuItem,
            this.查询预订情况ToolStripMenuItem});
            this.会议室管理ToolStripMenuItem.Name = "会议室管理ToolStripMenuItem";
            this.会议室管理ToolStripMenuItem.Size = new System.Drawing.Size(93, 24);
            this.会议室管理ToolStripMenuItem.Text = "会议室管理";
            // 
            // 预订会议室ToolStripMenuItem
            // 
            this.预订会议室ToolStripMenuItem.Name = "预订会议室ToolStripMenuItem";
            this.预订会议室ToolStripMenuItem.Size = new System.Drawing.Size(170, 24);
            this.预订会议室ToolStripMenuItem.Text = "预订会议室";
            this.预订会议室ToolStripMenuItem.Click += new System.EventHandler(this.预订会议室ToolStripMenuItem_Click);
            // 
            // 查询预订情况ToolStripMenuItem
            // 
            this.查询预订情况ToolStripMenuItem.Name = "查询预订情况ToolStripMenuItem";
            this.查询预订情况ToolStripMenuItem.Size = new System.Drawing.Size(170, 24);
            this.查询预订情况ToolStripMenuItem.Text = "查询预订情况";
            this.查询预订情况ToolStripMenuItem.Click += new System.EventHandler(this.查询预订情况ToolStripMenuItem_Click);
            // 
            // 会议纪要管理ToolStripMenuItem
            // 
            this.会议纪要管理ToolStripMenuItem.Name = "会议纪要管理ToolStripMenuItem";
            this.会议纪要管理ToolStripMenuItem.Size = new System.Drawing.Size(107, 24);
            this.会议纪要管理ToolStripMenuItem.Text = "会议纪要管理";
            // 
            // 退出系统ToolStripMenuItem
            // 
            this.退出系统ToolStripMenuItem.Name = "退出系统ToolStripMenuItem";
            this.退出系统ToolStripMenuItem.Size = new System.Drawing.Size(79, 24);
            this.退出系统ToolStripMenuItem.Text = "退出系统";
            this.退出系统ToolStripMenuItem.Click += new System.EventHandler(this.退出系统ToolStripMenuItem_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(655, 379);
            this.Controls.Add(this.menuStrip1);
            this.IsMdiContainer = true;
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "MainForm";
            this.Text = "会议室预订系统";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.MainForm_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem 会议室管理ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 预订会议室ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 查询预订情况ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 会议纪要管理ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 退出系统ToolStripMenuItem;
    }
}

