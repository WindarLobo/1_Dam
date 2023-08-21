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
        Me.btnLeer = New System.Windows.Forms.Button
        Me.txtMues = New System.Windows.Forms.TextBox
        Me.SuspendLayout()
        '
        'btnLeer
        '
        Me.btnLeer.Location = New System.Drawing.Point(97, 142)
        Me.btnLeer.Name = "btnLeer"
        Me.btnLeer.Size = New System.Drawing.Size(102, 49)
        Me.btnLeer.TabIndex = 0
        Me.btnLeer.Text = "Leer Entero\Real"
        Me.btnLeer.UseVisualStyleBackColor = True
        '
        'txtMues
        '
        Me.txtMues.Location = New System.Drawing.Point(28, 29)
        Me.txtMues.Multiline = True
        Me.txtMues.Name = "txtMues"
        Me.txtMues.Size = New System.Drawing.Size(242, 79)
        Me.txtMues.TabIndex = 1
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(292, 252)
        Me.Controls.Add(Me.txtMues)
        Me.Controls.Add(Me.btnLeer)
        Me.Name = "Form1"
        Me.Text = "Lectura Entero/Real"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnLeer As System.Windows.Forms.Button
    Friend WithEvents txtMues As System.Windows.Forms.TextBox

End Class
