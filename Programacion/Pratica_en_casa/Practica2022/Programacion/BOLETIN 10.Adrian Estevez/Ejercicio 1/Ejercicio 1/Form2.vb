Public Class Form2
    Public f, ff As Boolean
    Public t As Integer
    Private Sub Form2_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
    End Sub
    Public Sub btnSi_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSi.Click
        If f = False Then
            Form1.txtNombre.Text = ""
            Form1.txtApellido.Text = ""
            Form1.txtTelefo.Text = ""
            Form1.txtCoreElec.Text = ""
            Form1.txtNotas.Text = ""
            ff = True
            Me.Visible = False
        Else
            ReDim Preserve Form1.mNue(t)
            Form1.mNue(t).nom = Form1.txtNombre.Text
            Form1.mNue(t).ape = Form1.txtApellido.Text
            Form1.mNue(t).num = Form1.txtTelefo.Text
            Form1.mNue(t).coEl = Form1.txtCoreElec.Text
            Form1.mNue(t).notas = Form1.txtNotas.Text
            t += 1
            Form1.btnGuardar.Enabled = True
        End If
    End Sub
    Private Sub btnNo_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnNo.Click
        Me.Close()
    End Sub
End Class