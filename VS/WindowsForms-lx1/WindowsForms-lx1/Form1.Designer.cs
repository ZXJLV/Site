namespace WindowsForms_lx1
{
    partial class ChaoShiHuiYuan
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
            this.components = new System.ComponentModel.Container();
            this.lblBiaoTi = new System.Windows.Forms.Label();
            this.lblZhangHao = new System.Windows.Forms.Label();
            this.lblPwd = new System.Windows.Forms.Label();
            this.txtZhangHao = new System.Windows.Forms.TextBox();
            this.txtPwd = new System.Windows.Forms.TextBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.rdoJIn = new System.Windows.Forms.RadioButton();
            this.rdoBoJin = new System.Windows.Forms.RadioButton();
            this.rdoZuanShi = new System.Windows.Forms.RadioButton();
            this.btoTianJia = new System.Windows.Forms.Button();
            this.btoTuiChu = new System.Windows.Forms.Button();
            this.lblZhuangTai = new System.Windows.Forms.Label();
            this.cboZhuangTai = new System.Windows.Forms.ComboBox();
            this.lblJiFen = new System.Windows.Forms.Label();
            this.txtJiFen = new System.Windows.Forms.TextBox();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.comDele = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.删除ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.colZhangHu = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colKaBie = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colJiFen = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colZhuangTai = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.comDele.SuspendLayout();
            this.SuspendLayout();
            // 
            // lblBiaoTi
            // 
            this.lblBiaoTi.AutoSize = true;
            this.lblBiaoTi.Font = new System.Drawing.Font("宋体", 14F);
            this.lblBiaoTi.Location = new System.Drawing.Point(305, 48);
            this.lblBiaoTi.Name = "lblBiaoTi";
            this.lblBiaoTi.Size = new System.Drawing.Size(186, 22);
            this.lblBiaoTi.TabIndex = 0;
            this.lblBiaoTi.Text = "超市会员管理系统";
            // 
            // lblZhangHao
            // 
            this.lblZhangHao.AutoSize = true;
            this.lblZhangHao.Font = new System.Drawing.Font("宋体", 11F);
            this.lblZhangHao.Location = new System.Drawing.Point(131, 89);
            this.lblZhangHao.Name = "lblZhangHao";
            this.lblZhangHao.Size = new System.Drawing.Size(59, 17);
            this.lblZhangHao.TabIndex = 0;
            this.lblZhangHao.Text = "账号：";
            // 
            // lblPwd
            // 
            this.lblPwd.AutoSize = true;
            this.lblPwd.Font = new System.Drawing.Font("宋体", 11F);
            this.lblPwd.Location = new System.Drawing.Point(355, 89);
            this.lblPwd.Name = "lblPwd";
            this.lblPwd.Size = new System.Drawing.Size(59, 17);
            this.lblPwd.TabIndex = 0;
            this.lblPwd.Text = "密码：";
            // 
            // txtZhangHao
            // 
            this.txtZhangHao.Location = new System.Drawing.Point(197, 89);
            this.txtZhangHao.Name = "txtZhangHao";
            this.txtZhangHao.Size = new System.Drawing.Size(108, 23);
            this.txtZhangHao.TabIndex = 1;
            // 
            // txtPwd
            // 
            this.txtPwd.Location = new System.Drawing.Point(434, 89);
            this.txtPwd.Name = "txtPwd";
            this.txtPwd.PasswordChar = '*';
            this.txtPwd.Size = new System.Drawing.Size(108, 23);
            this.txtPwd.TabIndex = 1;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.rdoZuanShi);
            this.groupBox1.Controls.Add(this.rdoBoJin);
            this.groupBox1.Controls.Add(this.rdoJIn);
            this.groupBox1.Location = new System.Drawing.Point(100, 138);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(455, 100);
            this.groupBox1.TabIndex = 2;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "卡别";
            // 
            // rdoJIn
            // 
            this.rdoJIn.AutoSize = true;
            this.rdoJIn.Location = new System.Drawing.Point(34, 45);
            this.rdoJIn.Name = "rdoJIn";
            this.rdoJIn.Size = new System.Drawing.Size(53, 18);
            this.rdoJIn.TabIndex = 0;
            this.rdoJIn.TabStop = true;
            this.rdoJIn.Text = "金卡";
            this.rdoJIn.UseVisualStyleBackColor = true;
            this.rdoJIn.CheckedChanged += new System.EventHandler(this.rdoJIn_CheckedChanged);
            // 
            // rdoBoJin
            // 
            this.rdoBoJin.AutoSize = true;
            this.rdoBoJin.Location = new System.Drawing.Point(162, 45);
            this.rdoBoJin.Name = "rdoBoJin";
            this.rdoBoJin.Size = new System.Drawing.Size(53, 18);
            this.rdoBoJin.TabIndex = 0;
            this.rdoBoJin.TabStop = true;
            this.rdoBoJin.Text = "铂金";
            this.rdoBoJin.UseVisualStyleBackColor = true;
            this.rdoBoJin.CheckedChanged += new System.EventHandler(this.rdoBoJin_CheckedChanged);
            // 
            // rdoZuanShi
            // 
            this.rdoZuanShi.AutoSize = true;
            this.rdoZuanShi.Location = new System.Drawing.Point(297, 45);
            this.rdoZuanShi.Name = "rdoZuanShi";
            this.rdoZuanShi.Size = new System.Drawing.Size(67, 18);
            this.rdoZuanShi.TabIndex = 0;
            this.rdoZuanShi.TabStop = true;
            this.rdoZuanShi.Text = "钻石卡";
            this.rdoZuanShi.UseVisualStyleBackColor = true;
            this.rdoZuanShi.CheckedChanged += new System.EventHandler(this.rdoZuanShi_CheckedChanged);
            // 
            // btoTianJia
            // 
            this.btoTianJia.Location = new System.Drawing.Point(594, 87);
            this.btoTianJia.Name = "btoTianJia";
            this.btoTianJia.Size = new System.Drawing.Size(75, 23);
            this.btoTianJia.TabIndex = 3;
            this.btoTianJia.Text = "添加";
            this.btoTianJia.UseVisualStyleBackColor = true;
            this.btoTianJia.Click += new System.EventHandler(this.btoTianJia_Click);
            // 
            // btoTuiChu
            // 
            this.btoTuiChu.Location = new System.Drawing.Point(594, 151);
            this.btoTuiChu.Name = "btoTuiChu";
            this.btoTuiChu.Size = new System.Drawing.Size(75, 23);
            this.btoTuiChu.TabIndex = 3;
            this.btoTuiChu.Text = "退出";
            this.btoTuiChu.UseVisualStyleBackColor = true;
            // 
            // lblZhuangTai
            // 
            this.lblZhuangTai.AutoSize = true;
            this.lblZhuangTai.Font = new System.Drawing.Font("宋体", 11F);
            this.lblZhuangTai.Location = new System.Drawing.Point(109, 262);
            this.lblZhuangTai.Name = "lblZhuangTai";
            this.lblZhuangTai.Size = new System.Drawing.Size(59, 17);
            this.lblZhuangTai.TabIndex = 0;
            this.lblZhuangTai.Text = "状态：";
            // 
            // cboZhuangTai
            // 
            this.cboZhuangTai.FormattingEnabled = true;
            this.cboZhuangTai.Location = new System.Drawing.Point(175, 262);
            this.cboZhuangTai.Name = "cboZhuangTai";
            this.cboZhuangTai.Size = new System.Drawing.Size(121, 22);
            this.cboZhuangTai.TabIndex = 4;
            this.cboZhuangTai.SelectedIndexChanged += new System.EventHandler(this.cboZhuangTai_SelectedIndexChanged);
            // 
            // lblJiFen
            // 
            this.lblJiFen.AutoSize = true;
            this.lblJiFen.Font = new System.Drawing.Font("宋体", 11F);
            this.lblJiFen.Location = new System.Drawing.Point(321, 267);
            this.lblJiFen.Name = "lblJiFen";
            this.lblJiFen.Size = new System.Drawing.Size(93, 17);
            this.lblJiFen.TabIndex = 0;
            this.lblJiFen.Text = "账户积分：";
            // 
            // txtJiFen
            // 
            this.txtJiFen.Location = new System.Drawing.Point(420, 267);
            this.txtJiFen.Name = "txtJiFen";
            this.txtJiFen.ReadOnly = true;
            this.txtJiFen.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.txtJiFen.Size = new System.Drawing.Size(108, 23);
            this.txtJiFen.TabIndex = 1;
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colZhangHu,
            this.colKaBie,
            this.colJiFen,
            this.colZhuangTai});
            this.dataGridView1.ContextMenuStrip = this.comDele;
            this.dataGridView1.Location = new System.Drawing.Point(12, 304);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 47;
            this.dataGridView1.RowTemplate.Height = 25;
            this.dataGridView1.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridView1.Size = new System.Drawing.Size(675, 237);
            this.dataGridView1.TabIndex = 5;
            // 
            // comDele
            // 
            this.comDele.ImageScalingSize = new System.Drawing.Size(18, 18);
            this.comDele.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.删除ToolStripMenuItem});
            this.comDele.Name = "comDele";
            this.comDele.Size = new System.Drawing.Size(107, 28);
            this.comDele.Text = "删除";
            // 
            // 删除ToolStripMenuItem
            // 
            this.删除ToolStripMenuItem.Name = "删除ToolStripMenuItem";
            this.删除ToolStripMenuItem.Size = new System.Drawing.Size(106, 24);
            this.删除ToolStripMenuItem.Text = "删除";
            // 
            // colZhangHu
            // 
            this.colZhangHu.DataPropertyName = "CustomeId";
            this.colZhangHu.HeaderText = "账户";
            this.colZhangHu.MinimumWidth = 6;
            this.colZhangHu.Name = "colZhangHu";
            this.colZhangHu.Width = 140;
            // 
            // colKaBie
            // 
            this.colKaBie.DataPropertyName = "CustomeType";
            this.colKaBie.HeaderText = "卡别";
            this.colKaBie.MinimumWidth = 6;
            this.colKaBie.Name = "colKaBie";
            this.colKaBie.Width = 140;
            // 
            // colJiFen
            // 
            this.colJiFen.DataPropertyName = "Score";
            this.colJiFen.HeaderText = "积分";
            this.colJiFen.MinimumWidth = 6;
            this.colJiFen.Name = "colJiFen";
            this.colJiFen.Width = 140;
            // 
            // colZhuangTai
            // 
            this.colZhuangTai.DataPropertyName = "StartesName";
            this.colZhuangTai.HeaderText = "状态";
            this.colZhuangTai.MinimumWidth = 6;
            this.colZhuangTai.Name = "colZhuangTai";
            this.colZhuangTai.Width = 140;
            // 
            // ChaoShiHuiYuan
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(698, 553);
            this.ContextMenuStrip = this.comDele;
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.cboZhuangTai);
            this.Controls.Add(this.btoTuiChu);
            this.Controls.Add(this.btoTianJia);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.txtJiFen);
            this.Controls.Add(this.txtPwd);
            this.Controls.Add(this.txtZhangHao);
            this.Controls.Add(this.lblPwd);
            this.Controls.Add(this.lblJiFen);
            this.Controls.Add(this.lblZhuangTai);
            this.Controls.Add(this.lblZhangHao);
            this.Controls.Add(this.lblBiaoTi);
            this.MaximizeBox = false;
            this.Name = "ChaoShiHuiYuan";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "超市会员管理系统";
            this.Load += new System.EventHandler(this.ChaoShiHuiYuan_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.comDele.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblBiaoTi;
        private System.Windows.Forms.Label lblZhangHao;
        private System.Windows.Forms.Label lblPwd;
        private System.Windows.Forms.TextBox txtZhangHao;
        private System.Windows.Forms.TextBox txtPwd;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton rdoZuanShi;
        private System.Windows.Forms.RadioButton rdoBoJin;
        private System.Windows.Forms.RadioButton rdoJIn;
        private System.Windows.Forms.Button btoTianJia;
        private System.Windows.Forms.Button btoTuiChu;
        private System.Windows.Forms.Label lblZhuangTai;
        private System.Windows.Forms.ComboBox cboZhuangTai;
        private System.Windows.Forms.Label lblJiFen;
        private System.Windows.Forms.TextBox txtJiFen;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.ContextMenuStrip comDele;
        private System.Windows.Forms.ToolStripMenuItem 删除ToolStripMenuItem;
        private System.Windows.Forms.DataGridViewTextBoxColumn colZhangHu;
        private System.Windows.Forms.DataGridViewTextBoxColumn colKaBie;
        private System.Windows.Forms.DataGridViewTextBoxColumn colJiFen;
        private System.Windows.Forms.DataGridViewTextBoxColumn colZhuangTai;
    }
}

