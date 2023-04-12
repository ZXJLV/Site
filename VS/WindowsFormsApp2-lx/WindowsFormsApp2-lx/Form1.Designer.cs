namespace WindowsFormsApp2_lx
{
    partial class ChaoShiGuanLi
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
            this.lblTxt = new System.Windows.Forms.Label();
            this.lblZhangHao = new System.Windows.Forms.Label();
            this.lblPwd = new System.Windows.Forms.Label();
            this.txtZhangHao = new System.Windows.Forms.TextBox();
            this.txtPwd = new System.Windows.Forms.TextBox();
            this.gopKaBie = new System.Windows.Forms.GroupBox();
            this.rdoJin = new System.Windows.Forms.RadioButton();
            this.rdoBoJin = new System.Windows.Forms.RadioButton();
            this.rdoZuanShi = new System.Windows.Forms.RadioButton();
            this.gopKaBie.SuspendLayout();
            this.SuspendLayout();
            // 
            // lblTxt
            // 
            this.lblTxt.AutoSize = true;
            this.lblTxt.Font = new System.Drawing.Font("隶书", 15.05455F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.lblTxt.Location = new System.Drawing.Point(280, 28);
            this.lblTxt.Name = "lblTxt";
            this.lblTxt.Size = new System.Drawing.Size(210, 23);
            this.lblTxt.TabIndex = 0;
            this.lblTxt.Text = "超市会员管理系统";
            // 
            // lblZhangHao
            // 
            this.lblZhangHao.AutoSize = true;
            this.lblZhangHao.Location = new System.Drawing.Point(123, 86);
            this.lblZhangHao.Name = "lblZhangHao";
            this.lblZhangHao.Size = new System.Drawing.Size(49, 14);
            this.lblZhangHao.TabIndex = 1;
            this.lblZhangHao.Text = "账号：";
            // 
            // lblPwd
            // 
            this.lblPwd.AutoSize = true;
            this.lblPwd.Location = new System.Drawing.Point(356, 86);
            this.lblPwd.Name = "lblPwd";
            this.lblPwd.Size = new System.Drawing.Size(49, 14);
            this.lblPwd.TabIndex = 1;
            this.lblPwd.Text = "账号：";
            // 
            // txtZhangHao
            // 
            this.txtZhangHao.Location = new System.Drawing.Point(178, 83);
            this.txtZhangHao.Name = "txtZhangHao";
            this.txtZhangHao.Size = new System.Drawing.Size(121, 23);
            this.txtZhangHao.TabIndex = 2;
            // 
            // txtPwd
            // 
            this.txtPwd.Location = new System.Drawing.Point(411, 83);
            this.txtPwd.Name = "txtPwd";
            this.txtPwd.Size = new System.Drawing.Size(121, 23);
            this.txtPwd.TabIndex = 2;
            // 
            // gopKaBie
            // 
            this.gopKaBie.Controls.Add(this.rdoZuanShi);
            this.gopKaBie.Controls.Add(this.rdoBoJin);
            this.gopKaBie.Controls.Add(this.rdoJin);
            this.gopKaBie.Location = new System.Drawing.Point(54, 138);
            this.gopKaBie.Name = "gopKaBie";
            this.gopKaBie.Size = new System.Drawing.Size(478, 100);
            this.gopKaBie.TabIndex = 3;
            this.gopKaBie.TabStop = false;
            this.gopKaBie.Text = "卡别：";
            // 
            // rdoJin
            // 
            this.rdoJin.AutoSize = true;
            this.rdoJin.Location = new System.Drawing.Point(48, 45);
            this.rdoJin.Name = "rdoJin";
            this.rdoJin.Size = new System.Drawing.Size(53, 18);
            this.rdoJin.TabIndex = 0;
            this.rdoJin.TabStop = true;
            this.rdoJin.Text = "金卡";
            this.rdoJin.UseVisualStyleBackColor = true;
            // 
            // rdoBoJin
            // 
            this.rdoBoJin.AutoSize = true;
            this.rdoBoJin.Location = new System.Drawing.Point(178, 45);
            this.rdoBoJin.Name = "rdoBoJin";
            this.rdoBoJin.Size = new System.Drawing.Size(67, 18);
            this.rdoBoJin.TabIndex = 0;
            this.rdoBoJin.TabStop = true;
            this.rdoBoJin.Text = "铂金卡";
            this.rdoBoJin.UseVisualStyleBackColor = true;
            this.rdoBoJin.CheckedChanged += new System.EventHandler(this.rdoBoJin_CheckedChanged);
            // 
            // rdoZuanShi
            // 
            this.rdoZuanShi.AutoSize = true;
            this.rdoZuanShi.Location = new System.Drawing.Point(315, 45);
            this.rdoZuanShi.Name = "rdoZuanShi";
            this.rdoZuanShi.Size = new System.Drawing.Size(67, 18);
            this.rdoZuanShi.TabIndex = 0;
            this.rdoZuanShi.TabStop = true;
            this.rdoZuanShi.Text = "钻石卡";
            this.rdoZuanShi.UseVisualStyleBackColor = true;
            // 
            // ChaoShiGuanLi
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.gopKaBie);
            this.Controls.Add(this.txtPwd);
            this.Controls.Add(this.txtZhangHao);
            this.Controls.Add(this.lblPwd);
            this.Controls.Add(this.lblZhangHao);
            this.Controls.Add(this.lblTxt);
            this.MaximizeBox = false;
            this.Name = "ChaoShiGuanLi";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "超市会员管理系统";
            this.gopKaBie.ResumeLayout(false);
            this.gopKaBie.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblTxt;
        private System.Windows.Forms.Label lblZhangHao;
        private System.Windows.Forms.Label lblPwd;
        private System.Windows.Forms.TextBox txtZhangHao;
        private System.Windows.Forms.TextBox txtPwd;
        private System.Windows.Forms.GroupBox gopKaBie;
        private System.Windows.Forms.RadioButton rdoZuanShi;
        private System.Windows.Forms.RadioButton rdoBoJin;
        private System.Windows.Forms.RadioButton rdoJin;
    }
}

