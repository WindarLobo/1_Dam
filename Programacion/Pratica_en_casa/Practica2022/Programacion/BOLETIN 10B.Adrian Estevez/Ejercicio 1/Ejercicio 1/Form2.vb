Public Class Form2
    Public f, ff As Boolean
    Public t As Integer
    Private Sub Form2_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Me.Show()
    End Sub
    Public Sub btnSi_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSi.Click
        Dim s As String
        Dim n As Integer
        If f = False Then
            Form1.txtNombre.Text = ""
            Form1.txtApellido.Text = ""
            Form1.txtTelefo.Text = ""
            Form1.txtCoreElec.Text = ""
            Form1.txtNotas.Text = ""
            ff = True
            Me.Visible = False
        Else
            If Form1.txtApellido.Text <> "" And Form1.txtNombre.Text <> "" And Form1.txtNotas.Text <> "" And Form1.txtCoreElec.Text <> "" And Form1.txtTelefo.Text <> "" Then
                ReDim Preserve Form1.j(Form1.tt)
                s = Form1.txtNombre.Text
                n = s.Length
                n += 1
                For i = n To Form1.txtNombre.MaxLength
                    s &= " "
                Next
                Form1.j(Form1.tt).nom = s
                s = Form1.txtApellido.Text
                n = s.Length
                n += 1
                For i = n To Form1.txtApellido.MaxLength
                    s &= " "
                Next
                Form1.j(Form1.tt).ape = s
                s = Form1.txtTelefo.Text
                n = s.Length
                n += 1
                For i = n To Form1.txtTelefo.MaxLength
                    s &= " "
                Next
                Form1.j(Form1.tt).num = s
                s = Form1.txtCoreElec.Text
                n = s.Length
                n += 1
                For i = n To Form1.txtCoreElec.MaxLength
                    s &= " "
                Next
                Form1.j(Form1.tt).coEl = s
                s = Form1.txtNotas.Text
                n = s.Length
                n += 1
                For i = n To Form1.txtNotas.MaxLength
                    s &= " "
                Next
                Form1.j(Form1.tt).notas = s
                Form1.tt += 1
            End If

            Form1.btnGuardar.Enabled = True
        End If
    End Sub
    Private Sub btnNo_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnNo.Click
        Me.Close()
    End Sub
End Class