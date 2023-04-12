namespace WinForm_KaoShi
{
    partial class Frm_LuRu
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
            this.lblJianCe = new System.Windows.Forms.Label();
            this.cboJianCe = new System.Windows.Forms.ComboBox();
            this.lblLuRuRen = new System.Windows.Forms.Label();
            this.txtLuRuRen = new System.Windows.Forms.TextBox();
            this.lblKaiShiTime = new System.Windows.Forms.Label();
            this.txtKaiShiTime = new System.Windows.Forms.TextBox();
            this.lblTingZhiTime = new System.Windows.Forms.Label();
            this.txtTingZhiTime = new System.Windows.Forms.TextBox();
            this.lblPM = new System.Windows.Forms.Label();
            this.txtPM = new System.Windows.Forms.TextBox();
            this.lblKongQiDengJi = new System.Windows.Forms.Label();
            this.txtKongQiDengJi = new System.Windows.Forms.TextBox();
            this.lblJi = new System.Windows.Forms.Label();
            this.lblZhuYi = new System.Windows.Forms.Label();
            this.txtZhuYi = new System.Windows.Forms.TextBox();
            this.btoTiJiao = new System.Windows.Forms.Button();
            this.btoQingKong = new System.Windows.Forms.Button();
            this.btoExit = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblJianCe
            // 
            this.lblJianCe.AutoSize = true;
            this.lblJianCe.Location = new System.Drawing.Point(74, 37);
            this.lblJianCe.Name = "lblJianCe";
            this.lblJianCe.Size = new System.Drawing.Size(63, 14);
            this.lblJianCe.TabIndex = 0;
            this.lblJianCe.Text = "监测站：";
            // 
            // cboJianCe
            // 
            this.cboJianCe.FormattingEnabled = true;
            this.cboJianCe.Location = new System.Drawing.Point(143, 34);
            this.cboJianCe.Name = "cboJianCe";
            this.cboJianCe.Size = new System.Drawing.Size(144, 22);
            this.cboJianCe.TabIndex = 1;
            // 
            // lblLuRuRen
            // 
            this.lblLuRuRen.AutoSize = true;
            this.lblLuRuRen.Location = new System.Drawing.Point(342, 37);
            this.lblLuRuRen.Name = "lblLuRuRen";
            this.lblLuRuRen.Size = new System.Drawing.Size(77, 14);
            this.lblLuRuRen.TabIndex = 0;
            this.lblLuRuRen.Text = "录入人员：";
            // 
            // txtLuRuRen
            // 
            this.txtLuRuRen.Location = new System.Drawing.Point(426, 34);
            this.txtLuRuRen.Name = "txtLuRuRen";
            this.txtLuRuRen.Size = new System.Drawing.Size(135, 23);
            this.txtLuRuRen.TabIndex = 2;
            // 
            // lblKaiShiTime
            // 
            this.lblKaiShiTime.AutoSize = true;
            this.lblKaiShiTime.Location = new System.Drawing.Point(32, 87);
            this.lblKaiShiTime.Name = "lblKaiShiTime";
            this.lblKaiShiTime.Size = new System.Drawing.Size(105, 14);
            this.lblKaiShiTime.TabIndex = 0;
            this.lblKaiShiTime.Text = "开始监测时间：";
            // 
            // txtKaiShiTime
            // 
            this.txtKaiShiTime.Location = new System.Drawing.Point(143, 84);
            this.txtKaiShiTime.Name = "txtKaiShiTime";
            this.txtKaiShiTime.Size = new System.Drawing.Size(168, 23);
            this.txtKaiShiTime.TabIndex = 2;
            // 
            // lblTingZhiTime
            // 
            this.lblTingZhiTime.AutoSize = true;
            this.lblTingZhiTime.Location = new System.Drawing.Point(32, 130);
            this.lblTingZhiTime.Name = "lblTingZhiTime";
            this.lblTingZhiTime.Size = new System.Drawing.Size(105, 14);
            this.lblTingZhiTime.TabIndex = 0;
            this.lblTingZhiTime.Text = "监测停止时间：";
            // 
            // txtTingZhiTime
            // 
            this.txtTingZhiTime.Location = new System.Drawing.Point(143, 127);
            this.txtTingZhiTime.Name = "txtTingZhiTime";
            this.txtTingZhiTime.Size = new System.Drawing.Size(168, 23);
            this.txtTingZhiTime.TabIndex = 2;
            // 
            // lblPM
            // 
            this.lblPM.AutoSize = true;
            this.lblPM.Location = new System.Drawing.Point(53, 168);
            this.lblPM.Name = "lblPM";
            this.lblPM.Size = new System.Drawing.Size(84, 14);
            this.lblPM.TabIndex = 0;
            this.lblPM.Text = "PM2.5指数：";
            // 
            // txtPM
            // 
            this.txtPM.Location = new System.Drawing.Point(143, 165);
            this.txtPM.Name = "txtPM";
            this.txtPM.Size = new System.Drawing.Size(168, 23);
            this.txtPM.TabIndex = 2;
            // 
            // lblKongQiDengJi
            // 
            this.lblKongQiDengJi.AutoSize = true;
            this.lblKongQiDengJi.Location = new System.Drawing.Point(335, 168);
            this.lblKongQiDengJi.Name = "lblKongQiDengJi";
            this.lblKongQiDengJi.Size = new System.Drawing.Size(105, 14);
            this.lblKongQiDengJi.TabIndex = 0;
            this.lblKongQiDengJi.Text = "空气质量等级：";
            // 
            // txtKongQiDengJi
            // 
            this.txtKongQiDengJi.Location = new System.Drawing.Point(446, 165);
            this.txtKongQiDengJi.Name = "txtKongQiDengJi";
            this.txtKongQiDengJi.Size = new System.Drawing.Size(44, 23);
            this.txtKongQiDengJi.TabIndex = 2;
            // 
            // lblJi
            // 
            this.lblJi.AutoSize = true;
            this.lblJi.Location = new System.Drawing.Point(496, 168);
            this.lblJi.Name = "lblJi";
            this.lblJi.Size = new System.Drawing.Size(21, 14);
            this.lblJi.TabIndex = 0;
            this.lblJi.Text = "级";
            // 
            // lblZhuYi
            // 
            this.lblZhuYi.AutoSize = true;
            this.lblZhuYi.Location = new System.Drawing.Point(60, 215);
            this.lblZhuYi.Name = "lblZhuYi";
            this.lblZhuYi.Size = new System.Drawing.Size(77, 14);
            this.lblZhuYi.TabIndex = 0;
            this.lblZhuYi.Text = "注意事项：";
            // 
            // txtZhuYi
            // 
            this.txtZhuYi.Location = new System.Drawing.Point(143, 212);
            this.txtZhuYi.Name = "txtZhuYi";
            this.txtZhuYi.Size = new System.Drawing.Size(418, 23);
            this.txtZhuYi.TabIndex = 2;
            // 
            // btoTiJiao
            // 
            this.btoTiJiao.Location = new System.Drawing.Point(77, 315);
            this.btoTiJiao.Name = "btoTiJiao";
            this.btoTiJiao.Size = new System.Drawing.Size(88, 34);
            this.btoTiJiao.TabIndex = 3;
            this.btoTiJiao.Text = "提交";
            this.btoTiJiao.UseVisualStyleBackColor = true;
            this.btoTiJiao.Click += new System.EventHandler(this.btoTiJiao_Click);
            // 
            // btoQingKong
            // 
            this.btoQingKong.Location = new System.Drawing.Point(288, 315);
            this.btoQingKong.Name = "btoQingKong";
            this.btoQingKong.Size = new System.Drawing.Size(88, 34);
            this.btoQingKong.TabIndex = 3;
            this.btoQingKong.Text = "清空";
            this.btoQingKong.UseVisualStyleBackColor = true;
            this.btoQingKong.Click += new System.EventHandler(this.btoQingKong_Click);
            // 
            // btoExit
            // 
            this.btoExit.Location = new System.Drawing.Point(499, 315);
            this.btoExit.Name = "btoExit";
            this.btoExit.Size = new System.Drawing.Size(88, 34);
            this.btoExit.TabIndex = 3;
            this.btoExit.Text = "关闭";
            this.btoExit.UseVisualStyleBackColor = true;
            this.btoExit.Click += new System.EventHandler(this.btoExit_Click);
            // 
            // Frm_LuRu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(660, 376);
            this.Controls.Add(this.btoExit);
            this.Controls.Add(this.btoQingKong);
            this.Controls.Add(this.btoTiJiao);
            this.Controls.Add(this.txtKongQiDengJi);
            this.Controls.Add(this.txtZhuYi);
            this.Controls.Add(this.txtPM);
            this.Controls.Add(this.txtTingZhiTime);
            this.Controls.Add(this.txtKaiShiTime);
            this.Controls.Add(this.txtLuRuRen);
            this.Controls.Add(this.cboJianCe);
            this.Controls.Add(this.lblLuRuRen);
            this.Controls.Add(this.lblJi);
            this.Controls.Add(this.lblKongQiDengJi);
            this.Controls.Add(this.lblZhuYi);
            this.Controls.Add(this.lblPM);
            this.Controls.Add(this.lblTingZhiTime);
            this.Controls.Add(this.lblKaiShiTime);
            this.Controls.Add(this.lblJianCe);
            this.Name = "Frm_LuRu";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "录入监测数据";
            this.Load += new System.EventHandler(this.Frm_LuRu_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblJianCe;
        private System.Windows.Forms.ComboBox cboJianCe;
        private System.Windows.Forms.Label lblLuRuRen;
        private System.Windows.Forms.TextBox txtLuRuRen;
        private System.Windows.Forms.Label lblKaiShiTime;
        private System.Windows.Forms.TextBox txtKaiShiTime;
        private System.Windows.Forms.Label lblTingZhiTime;
        private System.Windows.Forms.TextBox txtTingZhiTime;
        private System.Windows.Forms.Label lblPM;
        private System.Windows.Forms.TextBox txtPM;
        private System.Windows.Forms.Label lblKongQiDengJi;
        private System.Windows.Forms.TextBox txtKongQiDengJi;
        private System.Windows.Forms.Label lblJi;
        private System.Windows.Forms.Label lblZhuYi;
        private System.Windows.Forms.TextBox txtZhuYi;
        private System.Windows.Forms.Button btoTiJiao;
        private System.Windows.Forms.Button btoQingKong;
        private System.Windows.Forms.Button btoExit;
    }
}