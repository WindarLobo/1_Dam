<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.btnContrl = New System.Windows.Forms.Button
        Me.btnArchi = New System.Windows.Forms.Button
        Me.txtMostrar = New System.Windows.Forms.TextBox
        Me.btnAbrir = New System.Windows.Forms.Button
        Me.Open = New System.Windows.Forms.OpenFileDialog
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.GroupBox2 = New System.Windows.Forms.GroupBox
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.SuspendLayout()
        '
        'btnContrl
        '
        Me.btnContrl.Location = New System.Drawing.Point(30, 75)
        Me.btnContrl.Name = "btnContrl"
        Me.btnContrl.Size = New System.Drawing.Size(138, 53)
        Me.btnContrl.TabIndex = 0
        Me.btnContrl.Text = "Mediante caja de texto"
        Me.btnContrl.UseVisualStyleBackColor = True
        '
        'btnArchi
        '
        Me.btnArchi.Location = New System.Drawing.Point(30, 19)
        Me.btnArchi.Name = "btnArchi"
        Me.btnArchi.Size = New System.Drawing.Size(138, 50)
        Me.btnArchi.TabIndex = 1
        Me.btnArchi.Text = "Mediante Archivo"
        Me.btnArchi.UseVisualStyleBackColor = True
        '
        'txtMostrar
        '
        Me.txtMostrar.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtMostrar.Location = New System.Drawing.Point(30, 12)
        Me.txtMostrar.Multiline = True
        Me.txtMostrar.Name = "txtMostrar"
        Me.txtMostrar.ReadOnly = True
        Me.txtMostrar.Size = New System.Drawing.Size(404, 101)
        Me.txtMostrar.TabIndex = 2
        '
        'btnAbrir
        '
        Me.btnAbrir.Location = New System.Drawing.Point(38, 33)
        Me.btnAbrir.Name = "btnAbrir"
        Me.btnAbrir.Size = New System.Drawing.Size(99, 42)
        Me.btnAbrir.TabIndex = 3
        Me.btnAbrir.Text = "Elegir Archivo"
        Me.btnAbrir.UseVisualStyleBackColor = True
        '
        'Open
        '
        Me.Open.FileName = "OpenFileDialog1"
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.btnContrl)
        Me.GroupBox1.Controls.Add(Me.btnArchi)
        Me.GroupBox1.Location = New System.Drawing.Point(12, 119)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(206, 134)
        Me.GroupBox1.TabIndex = 4
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Como mostrar datos?"
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.btnAbrir)
        Me.GroupBox2.Location = New System.Drawing.Point(249, 138)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(174, 94)
        Me.GroupBox2.TabIndex = 5
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Apertura"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(473, 274)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.txtMostrar)
        Me.Name = "Form1"
        Me.Text = "Cuenta palabras,caracteres..."
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox2.ResumeLayout(False)
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnContrl As System.Windows.Forms.Button
    Friend WithEvents btnArchi As System.Windows.Forms.Button
    Friend WithEvents txtMostrar As System.Windows.Forms.TextBox
    Friend WithEvents btnAbrir As System.Windows.Forms.Button
    Friend WithEvents Open As System.Windows.Forms.OpenFileDialog
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents GroupBox2 As System.Windows.Forms.GroupBox

End Class
