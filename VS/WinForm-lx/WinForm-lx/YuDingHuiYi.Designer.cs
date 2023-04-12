namespace WinForm_lx
{
    partial class YuDingHuiYi
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
            this.lblTJYDXX = new System.Windows.Forms.Label();
            this.lblXZHYS = new System.Windows.Forms.Label();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.lblYuDingName = new System.Windows.Forms.Label();
            this.lblKaiShiTime = new System.Windows.Forms.Label();
            this.lblYuDingShiChang = new System.Windows.Forms.Label();
            this.lblLuRuName = new System.Windows.Forms.Label();
            this.lblYuDingWay = new System.Windows.Forms.Label();
            this.txtName = new System.Windows.Forms.TextBox();
            this.txtTime = new System.Windows.Forms.TextBox();
            this.txtShiChang = new System.Windows.Forms.TextBox();
            this.txtLuRuName = new System.Windows.Forms.TextBox();
            this.txtYuanYin = new System.Windows.Forms.TextBox();
            this.btnBaoCun = new System.Windows.Forms.Button();
            this.btnQingKong = new System.Windows.Forms.Button();
            this.btuExit = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblTJYDXX
            // 
            this.lblTJYDXX.AutoSize = true;
            this.lblTJYDXX.Font = new System.Drawing.Font("微软雅黑", 13.74545F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.lblTJYDXX.ForeColor = System.Drawing.SystemColors.ControlText;
            this.lblTJYDXX.Location = new System.Drawing.Point(311, 60);
            this.lblTJYDXX.Name = "lblTJYDXX";
            this.lblTJYDXX.Size = new System.Drawing.Size(138, 28);
            this.lblTJYDXX.TabIndex = 0;
            this.lblTJYDXX.Text = "添加预订信息";
            this.lblTJYDXX.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblXZHYS
            // 
            this.lblXZHYS.AutoSize = true;
            this.lblXZHYS.Font = new System.Drawing.Font("微软雅黑", 11F);
            this.lblXZHYS.ForeColor = System.Drawing.SystemColors.ControlText;
            this.lblXZHYS.Location = new System.Drawing.Point(142, 115);
            this.lblXZHYS.Name = "lblXZHYS";
            this.lblXZHYS.Size = new System.Drawing.Size(112, 23);
            this.lblXZHYS.TabIndex = 0;
            this.lblXZHYS.Text = "选择会议室：";
            this.lblXZHYS.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Location = new System.Drawing.Point(264, 116);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(121, 22);
            this.comboBox1.TabIndex = 1;
            this.comboBox1.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // lblYuDingName
            // 
            this.lblYuDingName.AutoSize = true;
            this.lblYuDingName.Font = new System.Drawing.Font("微软雅黑", 11F);
            this.lblYuDingName.ForeColor = System.Drawing.SystemColors.ControlText;
            this.lblYuDingName.Location = new System.Drawing.Point(142, 162);
            this.lblYuDingName.Name = "lblYuDingName";
            this.lblYuDingName.Size = new System.Drawing.Size(112, 23);
            this.lblYuDingName.TabIndex = 0;
            this.lblYuDingName.Text = "预定人姓名：";
            this.lblYuDingName.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblKaiShiTime
            // 
            this.lblKaiShiTime.AutoSize = true;
            this.lblKaiShiTime.Font = new System.Drawing.Font("微软雅黑", 11F);
            this.lblKaiShiTime.ForeColor = System.Drawing.SystemColors.ControlText;
            this.lblKaiShiTime.Location = new System.Drawing.Point(125, 207);
            this.lblKaiShiTime.Name = "lblKaiShiTime";
            this.lblKaiShiTime.Size = new System.Drawing.Size(129, 23);
            this.lblKaiShiTime.TabIndex = 0;
            this.lblKaiShiTime.Text = "预定开始时间：";
            this.lblKaiShiTime.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblYuDingShiChang
            // 
            this.lblYuDingShiChang.AutoSize = true;
            this.lblYuDingShiChang.Font = new System.Drawing.Font("微软雅黑", 11F);
            this.lblYuDingShiChang.ForeColor = System.Drawing.SystemColors.ControlText;
            this.lblYuDingShiChang.Location = new System.Drawing.Point(159, 244);
            this.lblYuDingShiChang.Name = "lblYuDingShiChang";
            this.lblYuDingShiChang.Size = new System.Drawing.Size(95, 23);
            this.lblYuDingShiChang.TabIndex = 0;
            this.lblYuDingShiChang.Text = "预定时长：";
            this.lblYuDingShiChang.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.lblYuDingShiChang.Click += new System.EventHandler(this.lblYuDingShiChang_Click);
            // 
            // lblLuRuName
            // 
            this.lblLuRuName.AutoSize = true;
            this.lblLuRuName.Font = new System.Drawing.Font("微软雅黑", 11F);
            this.lblLuRuName.ForeColor = System.Drawing.SystemColors.ControlText;
            this.lblLuRuName.Location = new System.Drawing.Point(142, 283);
            this.lblLuRuName.Name = "lblLuRuName";
            this.lblLuRuName.Size = new System.Drawing.Size(112, 23);
            this.lblLuRuName.TabIndex = 0;
            this.lblLuRuName.Text = "录入人姓名：";
            this.lblLuRuName.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.lblLuRuName.Click += new System.EventHandler(this.lblYuDingShiChang_Click);
            // 
            // lblYuDingWay
            // 
            this.lblYuDingWay.AutoSize = true;
            this.lblYuDingWay.Font = new System.Drawing.Font("微软雅黑", 11F);
            this.lblYuDingWay.ForeColor = System.Drawing.SystemColors.ControlText;
            this.lblYuDingWay.Location = new System.Drawing.Point(159, 317);
            this.lblYuDingWay.Name = "lblYuDingWay";
            this.lblYuDingWay.Size = new System.Drawing.Size(95, 23);
            this.lblYuDingWay.TabIndex = 0;
            this.lblYuDingWay.Text = "预订原因：";
            this.lblYuDingWay.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.lblYuDingWay.Click += new System.EventHandler(this.lblYuDingShiChang_Click);
            // 
            // txtName
            // 
            this.txtName.Location = new System.Drawing.Point(264, 161);
            this.txtName.Name = "txtName";
            this.txtName.Size = new System.Drawing.Size(121, 23);
            this.txtName.TabIndex = 2;
            // 
            // txtTime
            // 
            this.txtTime.Location = new System.Drawing.Point(264, 210);
            this.txtTime.Name = "txtTime";
            this.txtTime.Size = new System.Drawing.Size(139, 23);
            this.txtTime.TabIndex = 2;
            // 
            // txtShiChang
            // 
            this.txtShiChang.Location = new System.Drawing.Point(264, 247);
            this.txtShiChang.Name = "txtShiChang";
            this.txtShiChang.Size = new System.Drawing.Size(34, 23);
            this.txtShiChang.TabIndex = 2;
            // 
            // txtLuRuName
            // 
            this.txtLuRuName.Location = new System.Drawing.Point(264, 286);
            this.txtLuRuName.Name = "txtLuRuName";
            this.txtLuRuName.Size = new System.Drawing.Size(121, 23);
            this.txtLuRuName.TabIndex = 2;
            // 
            // txtYuanYin
            // 
            this.txtYuanYin.Location = new System.Drawing.Point(264, 320);
            this.txtYuanYin.Name = "txtYuanYin";
            this.txtYuanYin.Size = new System.Drawing.Size(246, 23);
            this.txtYuanYin.TabIndex = 2;
            // 
            // btnBaoCun
            // 
            this.btnBaoCun.Location = new System.Drawing.Point(122, 391);
            this.btnBaoCun.Name = "btnBaoCun";
            this.btnBaoCun.Size = new System.Drawing.Size(89, 32);
            this.btnBaoCun.TabIndex = 3;
            this.btnBaoCun.Text = "保存";
            this.btnBaoCun.UseVisualStyleBackColor = true;
            this.btnBaoCun.Click += new System.EventHandler(this.btnBaoCun_Click);
            // 
            // btnQingKong
            // 
            this.btnQingKong.Location = new System.Drawing.Point(238, 391);
            this.btnQingKong.Name = "btnQingKong";
            this.btnQingKong.Size = new System.Drawing.Size(89, 32);
            this.btnQingKong.TabIndex = 3;
            this.btnQingKong.Text = "清空";
            this.btnQingKong.UseVisualStyleBackColor = true;
            this.btnQingKong.Click += new System.EventHandler(this.btnQingKong_Click);
            // 
            // btuExit
            // 
            this.btuExit.Location = new System.Drawing.Point(360, 391);
            this.btuExit.Name = "btuExit";
            this.btuExit.Size = new System.Drawing.Size(89, 32);
            this.btuExit.TabIndex = 3;
            this.btuExit.Text = "关闭";
            this.btuExit.UseVisualStyleBackColor = true;
            this.btuExit.Click += new System.EventHandler(this.btuExit_Click);
            // 
            // YuDingHuiYi
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(642, 443);
            this.Controls.Add(this.btuExit);
            this.Controls.Add(this.btnQingKong);
            this.Controls.Add(this.btnBaoCun);
            this.Controls.Add(this.txtYuanYin);
            this.Controls.Add(this.txtLuRuName);
            this.Controls.Add(this.txtShiChang);
            this.Controls.Add(this.txtTime);
            this.Controls.Add(this.txtName);
            this.Controls.Add(this.comboBox1);
            this.Controls.Add(this.lblYuDingWay);
            this.Controls.Add(this.lblLuRuName);
            this.Controls.Add(this.lblYuDingShiChang);
            this.Controls.Add(this.lblKaiShiTime);
            this.Controls.Add(this.lblYuDingName);
            this.Controls.Add(this.lblXZHYS);
            this.Controls.Add(this.lblTJYDXX);
            this.Name = "YuDingHuiYi";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "预订会议室";
            this.Load += new System.EventHandler(this.YuDingHuiYi_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblTJYDXX;
        private System.Windows.Forms.Label lblXZHYS;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.Label lblYuDingName;
        private System.Windows.Forms.Label lblKaiShiTime;
        private System.Windows.Forms.Label lblYuDingShiChang;
        private System.Windows.Forms.Label lblLuRuName;
        private System.Windows.Forms.Label lblYuDingWay;
        private System.Windows.Forms.TextBox txtName;
        private System.Windows.Forms.TextBox txtTime;
        private System.Windows.Forms.TextBox txtShiChang;
        private System.Windows.Forms.TextBox txtLuRuName;
        private System.Windows.Forms.TextBox txtYuanYin;
        private System.Windows.Forms.Button btnBaoCun;
        private System.Windows.Forms.Button btnQingKong;
        private System.Windows.Forms.Button btuExit;
    }
}