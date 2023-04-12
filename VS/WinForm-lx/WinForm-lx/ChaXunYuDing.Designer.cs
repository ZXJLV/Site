namespace WinForm_lx
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
            this.lblYuDingName = new System.Windows.Forms.Label();
            this.txtName = new System.Windows.Forms.TextBox();
            this.btuChaXun = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.boardScheduleManagerDataSetBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.boardScheduleManagerDataSet = new WinForm_lx.BoardScheduleManagerDataSet();
            this.btuExit = new System.Windows.Forms.Button();
            this.id = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.boardrommID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.intendedName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.startTime = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.duration = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.enterintName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.reason = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.boardScheduleManagerDataSetBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.boardScheduleManagerDataSet)).BeginInit();
            this.SuspendLayout();
            // 
            // lblYuDingName
            // 
            this.lblYuDingName.AutoSize = true;
            this.lblYuDingName.Font = new System.Drawing.Font("微软雅黑", 15F);
            this.lblYuDingName.Location = new System.Drawing.Point(85, 44);
            this.lblYuDingName.Name = "lblYuDingName";
            this.lblYuDingName.Size = new System.Drawing.Size(151, 30);
            this.lblYuDingName.TabIndex = 0;
            this.lblYuDingName.Text = "预定人姓名：";
            // 
            // txtName
            // 
            this.txtName.Location = new System.Drawing.Point(224, 51);
            this.txtName.Name = "txtName";
            this.txtName.Size = new System.Drawing.Size(174, 23);
            this.txtName.TabIndex = 1;
            // 
            // btuChaXun
            // 
            this.btuChaXun.Location = new System.Drawing.Point(427, 50);
            this.btuChaXun.Name = "btuChaXun";
            this.btuChaXun.Size = new System.Drawing.Size(75, 23);
            this.btuChaXun.TabIndex = 2;
            this.btuChaXun.Text = "查询";
            this.btuChaXun.UseVisualStyleBackColor = true;
            this.btuChaXun.Click += new System.EventHandler(this.btuChaXun_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.id,
            this.boardrommID,
            this.intendedName,
            this.startTime,
            this.duration,
            this.enterintName,
            this.reason});
            this.dataGridView1.DataSource = this.boardScheduleManagerDataSetBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(12, 109);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 47;
            this.dataGridView1.RowTemplate.Height = 25;
            this.dataGridView1.Size = new System.Drawing.Size(776, 329);
            this.dataGridView1.TabIndex = 3;
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
            // btuExit
            // 
            this.btuExit.Location = new System.Drawing.Point(574, 446);
            this.btuExit.Name = "btuExit";
            this.btuExit.Size = new System.Drawing.Size(75, 23);
            this.btuExit.TabIndex = 2;
            this.btuExit.Text = "关闭";
            this.btuExit.UseVisualStyleBackColor = true;
            this.btuExit.Click += new System.EventHandler(this.btuExit_Click);
            // 
            // id
            // 
            this.id.DataPropertyName = "id";
            this.id.HeaderText = "id";
            this.id.MinimumWidth = 6;
            this.id.Name = "id";
            this.id.Width = 115;
            // 
            // boardrommID
            // 
            this.boardrommID.DataPropertyName = "boardrommID";
            this.boardrommID.HeaderText = "ID";
            this.boardrommID.MinimumWidth = 6;
            this.boardrommID.Name = "boardrommID";
            this.boardrommID.Width = 115;
            // 
            // intendedName
            // 
            this.intendedName.DataPropertyName = "intendedName";
            this.intendedName.HeaderText = "intendedName";
            this.intendedName.MinimumWidth = 6;
            this.intendedName.Name = "intendedName";
            this.intendedName.Width = 115;
            // 
            // startTime
            // 
            this.startTime.DataPropertyName = "startTime";
            this.startTime.HeaderText = "startTime";
            this.startTime.MinimumWidth = 6;
            this.startTime.Name = "startTime";
            this.startTime.Width = 115;
            // 
            // duration
            // 
            this.duration.DataPropertyName = "duration";
            this.duration.HeaderText = "duration";
            this.duration.MinimumWidth = 6;
            this.duration.Name = "duration";
            this.duration.Width = 115;
            // 
            // enterintName
            // 
            this.enterintName.DataPropertyName = "enterintName";
            this.enterintName.HeaderText = "enterintName";
            this.enterintName.MinimumWidth = 6;
            this.enterintName.Name = "enterintName";
            this.enterintName.Width = 115;
            // 
            // reason
            // 
            this.reason.DataPropertyName = "reason";
            this.reason.HeaderText = "reason";
            this.reason.MinimumWidth = 6;
            this.reason.Name = "reason";
            this.reason.Width = 115;
            // 
            // ChaXunYuDing
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 481);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.btuExit);
            this.Controls.Add(this.btuChaXun);
            this.Controls.Add(this.txtName);
            this.Controls.Add(this.lblYuDingName);
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

        private System.Windows.Forms.Label lblYuDingName;
        private System.Windows.Forms.TextBox txtName;
        private System.Windows.Forms.Button btuChaXun;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.BindingSource boardScheduleManagerDataSetBindingSource;
        private BoardScheduleManagerDataSet boardScheduleManagerDataSet;
        private System.Windows.Forms.Button btuExit;
        private System.Windows.Forms.DataGridViewTextBoxColumn id;
        private System.Windows.Forms.DataGridViewTextBoxColumn boardrommID;
        private System.Windows.Forms.DataGridViewTextBoxColumn intendedName;
        private System.Windows.Forms.DataGridViewTextBoxColumn startTime;
        private System.Windows.Forms.DataGridViewTextBoxColumn duration;
        private System.Windows.Forms.DataGridViewTextBoxColumn enterintName;
        private System.Windows.Forms.DataGridViewTextBoxColumn reason;
    }
}