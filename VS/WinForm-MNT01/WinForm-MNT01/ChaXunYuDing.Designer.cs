namespace WinForm_MNT01
{
    partial class ChaXunYuDing
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
            this.components = new System.ComponentModel.Container();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.预订编号 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.会议室 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.预定人名称 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.开始时间 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.预订时长 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.录入人姓名 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.预订原因 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.boardScheduleManagerDataSetBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.boardScheduleManagerDataSet = new WinForm_MNT01.BoardScheduleManagerDataSet();
            this.backgroundWorker1 = new System.ComponentModel.BackgroundWorker();
            this.button2 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.boardScheduleManagerDataSetBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.boardScheduleManagerDataSet)).BeginInit();
            this.SuspendLayout();
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(149, 39);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(144, 23);
            this.textBox1.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("宋体", 10F);
            this.label1.Location = new System.Drawing.Point(40, 41);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(103, 16);
            this.label1.TabIndex = 1;
            this.label1.Text = "预定人姓名：";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(337, 36);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 26);
            this.button1.TabIndex = 2;
            this.button1.Text = "查询";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.预订编号,
            this.会议室,
            this.预定人名称,
            this.开始时间,
            this.预订时长,
            this.录入人姓名,
            this.预订原因});
            this.dataGridView1.DataSource = this.boardScheduleManagerDataSetBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(12, 82);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 47;
            this.dataGridView1.RowTemplate.Height = 25;
            this.dataGridView1.Size = new System.Drawing.Size(722, 290);
            this.dataGridView1.TabIndex = 3;
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // 预订编号
            // 
            this.预订编号.DataPropertyName = "id";
            this.预订编号.HeaderText = "预订编号";
            this.预订编号.MinimumWidth = 6;
            this.预订编号.Name = "预订编号";
            this.预订编号.Width = 115;
            // 
            // 会议室
            // 
            this.会议室.DataPropertyName = "boardName";
            this.会议室.HeaderText = "会议室";
            this.会议室.MinimumWidth = 6;
            this.会议室.Name = "会议室";
            this.会议室.Width = 115;
            // 
            // 预定人名称
            // 
            this.预定人名称.DataPropertyName = "intendedName";
            this.预定人名称.HeaderText = "预定人名称";
            this.预定人名称.MinimumWidth = 6;
            this.预定人名称.Name = "预定人名称";
            this.预定人名称.Width = 115;
            // 
            // 开始时间
            // 
            this.开始时间.DataPropertyName = "startTime";
            this.开始时间.HeaderText = "开始时间";
            this.开始时间.MinimumWidth = 6;
            this.开始时间.Name = "开始时间";
            this.开始时间.Width = 115;
            // 
            // 预订时长
            // 
            this.预订时长.DataPropertyName = "duration";
            this.预订时长.HeaderText = "预订时长";
            this.预订时长.MinimumWidth = 6;
            this.预订时长.Name = "预订时长";
            this.预订时长.Width = 115;
            // 
            // 录入人姓名
            // 
            this.录入人姓名.DataPropertyName = "enterintName";
            this.录入人姓名.HeaderText = "录入人姓名";
            this.录入人姓名.MinimumWidth = 6;
            this.录入人姓名.Name = "录入人姓名";
            this.录入人姓名.Width = 115;
            // 
            // 预订原因
            // 
            this.预订原因.DataPropertyName = "reason";
            this.预订原因.HeaderText = "预订原因";
            this.预订原因.MinimumWidth = 6;
            this.预订原因.Name = "预订原因";
            this.预订原因.Width = 115;
            // 
            // boardScheduleManagerDataSetBindingSource
            // 
            this.boardScheduleManagerDataSetBindingSource.DataSource = this.boardScheduleManagerDataSet;
            this.boardScheduleManagerDataSetBindingSource.Position = 0;
            // 
            // boardScheduleManagerDataSet
            // 
            this.boardScheduleManagerDataSet.DataSetName = "BoardScheduleManagerDataSet";
            this.boardScheduleManagerDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(566, 378);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 26);
            this.button2.TabIndex = 2;
            this.button2.Text = "关闭";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // ChaXunYuDing
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(750, 450);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBox1);
            this.Name = "ChaXunYuDing";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "查询预订情况";
            this.Load += new System.EventHandler(this.ChaXunYuDing_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.boardScheduleManagerDataSetBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.boardScheduleManagerDataSet)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.BindingSource boardScheduleManagerDataSetBindingSource;
        private BoardScheduleManagerDataSet boardScheduleManagerDataSet;
        private System.ComponentModel.BackgroundWorker backgroundWorker1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.DataGridViewTextBoxColumn 预订编号;
        private System.Windows.Forms.DataGridViewTextBoxColumn 会议室;
        private System.Windows.Forms.DataGridViewTextBoxColumn 预定人名称;
        private System.Windows.Forms.DataGridViewTextBoxColumn 开始时间;
        private System.Windows.Forms.DataGridViewTextBoxColumn 预订时长;
        private System.Windows.Forms.DataGridViewTextBoxColumn 录入人姓名;
        private System.Windows.Forms.DataGridViewTextBoxColumn 预订原因;
    }
}