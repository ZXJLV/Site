namespace WinForm_KaoShi
{
    partial class Frm_ChaXun
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblLuRuRenYuan = new System.Windows.Forms.Label();
            this.txtLuRuRenYuan = new System.Windows.Forms.TextBox();
            this.btnChaZhao = new System.Windows.Forms.Button();
            this.btnGuanBi = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.StationName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.InputName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.StartDate = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.EndDate = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.PM = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Level = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Notes = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // lblLuRuRenYuan
            // 
            this.lblLuRuRenYuan.AutoSize = true;
            this.lblLuRuRenYuan.Font = new System.Drawing.Font("宋体", 12F);
            this.lblLuRuRenYuan.Location = new System.Drawing.Point(91, 42);
            this.lblLuRuRenYuan.Name = "lblLuRuRenYuan";
            this.lblLuRuRenYuan.Size = new System.Drawing.Size(104, 19);
            this.lblLuRuRenYuan.TabIndex = 0;
            this.lblLuRuRenYuan.Text = "录入人员：";
            // 
            // txtLuRuRenYuan
            // 
            this.txtLuRuRenYuan.Location = new System.Drawing.Point(202, 42);
            this.txtLuRuRenYuan.Name = "txtLuRuRenYuan";
            this.txtLuRuRenYuan.Size = new System.Drawing.Size(234, 23);
            this.txtLuRuRenYuan.TabIndex = 1;
            // 
            // btnChaZhao
            // 
            this.btnChaZhao.Location = new System.Drawing.Point(476, 41);
            this.btnChaZhao.Name = "btnChaZhao";
            this.btnChaZhao.Size = new System.Drawing.Size(85, 24);
            this.btnChaZhao.TabIndex = 2;
            this.btnChaZhao.Text = "查找";
            this.btnChaZhao.UseVisualStyleBackColor = true;
            this.btnChaZhao.Click += new System.EventHandler(this.btnQuXiao_Click);
            // 
            // btnGuanBi
            // 
            this.btnGuanBi.Location = new System.Drawing.Point(603, 42);
            this.btnGuanBi.Name = "btnGuanBi";
            this.btnGuanBi.Size = new System.Drawing.Size(85, 24);
            this.btnGuanBi.TabIndex = 2;
            this.btnGuanBi.Text = "关闭";
            this.btnGuanBi.UseVisualStyleBackColor = true;
            this.btnGuanBi.Click += new System.EventHandler(this.btnGuanBi_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.StationName,
            this.InputName,
            this.StartDate,
            this.EndDate,
            this.PM,
            this.Level,
            this.Notes});
            this.dataGridView1.Location = new System.Drawing.Point(-1, 82);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 47;
            this.dataGridView1.RowTemplate.Height = 25;
            this.dataGridView1.Size = new System.Drawing.Size(805, 326);
            this.dataGridView1.TabIndex = 3;
            // 
            // StationName
            // 
            this.StationName.DataPropertyName = "StationName";
            this.StationName.HeaderText = "监测站";
            this.StationName.MinimumWidth = 6;
            this.StationName.Name = "StationName";
            this.StationName.Width = 115;
            // 
            // InputName
            // 
            this.InputName.DataPropertyName = "InputName";
            this.InputName.HeaderText = "录入成员";
            this.InputName.MinimumWidth = 6;
            this.InputName.Name = "InputName";
            this.InputName.Width = 115;
            // 
            // StartDate
            // 
            this.StartDate.DataPropertyName = "StartDate";
            this.StartDate.HeaderText = "开始监测时间";
            this.StartDate.MinimumWidth = 6;
            this.StartDate.Name = "StartDate";
            this.StartDate.Width = 115;
            // 
            // EndDate
            // 
            this.EndDate.DataPropertyName = "EndDate";
            this.EndDate.HeaderText = "监测停止时间";
            this.EndDate.MinimumWidth = 6;
            this.EndDate.Name = "EndDate";
            this.EndDate.Width = 115;
            // 
            // PM
            // 
            this.PM.DataPropertyName = "PM";
            this.PM.HeaderText = "PM2.5指数";
            this.PM.MinimumWidth = 6;
            this.PM.Name = "PM";
            this.PM.Width = 115;
            // 
            // Level
            // 
            this.Level.DataPropertyName = "Level";
            this.Level.HeaderText = "空气质量等级";
            this.Level.MinimumWidth = 6;
            this.Level.Name = "Level";
            this.Level.Width = 115;
            // 
            // Notes
            // 
            this.Notes.DataPropertyName = "Notes";
            this.Notes.HeaderText = "注意实现";
            this.Notes.MinimumWidth = 6;
            this.Notes.Name = "Notes";
            this.Notes.Width = 115;
            // 
            // Frm_ChaXun
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 411);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.btnGuanBi);
            this.Controls.Add(this.btnChaZhao);
            this.Controls.Add(this.txtLuRuRenYuan);
            this.Controls.Add(this.lblLuRuRenYuan);
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Frm_ChaXun";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "查询监测结果";
            this.Load += new System.EventHandler(this.Frm_ChaXun_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblLuRuRenYuan;
        private System.Windows.Forms.TextBox txtLuRuRenYuan;
        private System.Windows.Forms.Button btnChaZhao;
        private System.Windows.Forms.Button btnGuanBi;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn StationName;
        private System.Windows.Forms.DataGridViewTextBoxColumn InputName;
        private System.Windows.Forms.DataGridViewTextBoxColumn StartDate;
        private System.Windows.Forms.DataGridViewTextBoxColumn EndDate;
        private System.Windows.Forms.DataGridViewTextBoxColumn PM;
        private System.Windows.Forms.DataGridViewTextBoxColumn Level;
        private System.Windows.Forms.DataGridViewTextBoxColumn Notes;
    }
}