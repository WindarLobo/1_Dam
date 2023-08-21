Imports System.IO
Public Class Form1
    Public Structure contact
        Dim nom, ape, coEl, num, notas As String
    End Structure
    Public m(), j() As contact
    Dim i As Integer
    Public t, n, o As Integer
    Public tt As Integer
    Public Function carga(ByRef m() As contact) As Boolean
        Dim file As FileStream
        Dim c As String
        Dim s As String
        Dim f As Boolean
        Dim y As Byte
        Dim b1 As BinaryReader
        file = New FileStream("Contactos.txt", FileMode.Open, FileAccess.Read)
        b1 = New BinaryReader(file)
        If file.Length = 0 Then
            f = False
        Else
            While b1.PeekChar <> -1
                Try
                    s = b1.ReadString
                    ReDim Preserve m(y)
                    m(y).nom = s.Substring(0, 10)
                    m(y).ape = s.Substring(10, 10)
                    m(y).num = s.Substring(20, 10)
                    m(y).coEl = s.Substring(30, 20)
                    m(y).notas = s.Substring(50, 200)
                    y += 1
                Catch ex As EndOfStreamException
                    ReDim Preserve m(y)
                    m(y).nom = s.Substring(0, 10)
                    m(y).ape = s.Substring(10, 10)
                    m(y).num = s.Substring(20, 10)
                    m(y).coEl = s.Substring(30, 20)
                    m(y).notas = s.Substring(50, 200)
                    y += 1
                    Exit While
                End Try
                s = Nothing
            End While
            f = True
        End If
        b1.Close()
        file.Close()
        Return f
    End Function
    Private Sub Label8_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Label8.Click
    End Sub
    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        If carga(m) = False Then
            MessageBox.Show("Actualmente la Base De Datos esta vacia")
            btnSiguie.Enabled = False
            btnAnterior.Enabled = False
        Else
            txtNombre.Text = m(0).nom
            txtApellido.Text = m(0).ape
            txtTelefo.Text = m(0).num
            txtCoreElec.Text = m(0).coEl
            txtNotas.Text = m(0).notas
            btnAnterior.Enabled = False
            Label12.Text = 1
            Label11.Text = m.Length
        End If
        ComboBox1.Items.Add("Nombre")
        ComboBox1.Items.Add("Apellidos")
        ComboBox1.Items.Add("Telefono")
        ComboBox1.Items.Add("E-Mail")


    End Sub
    Private Sub btnSiguie_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSiguie.Click
        añadir(e)
        Try
            If t < m.Length - 1 Then
                t += 1
                txtNombre.Text = m(t).nom
                txtApellido.Text = m(t).ape
                txtTelefo.Text = m(t).num
                txtCoreElec.Text = m(t).coEl
                txtNotas.Text = m(t).notas
                btnAnterior.Enabled = True
                Label12.Text = t + 1
                If t = m.Length - 1 Then
                    btnSiguie.Enabled = False
                End If
            End If
        Catch ex As NullReferenceException
            Exit Sub
        End Try
    End Sub
    Public Sub btnGuardar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnGuardar.Click
        añadir(e)
       Dim b1 As BinaryReader
        Dim b2 As BinaryWriter
        Dim file As FileStream
        Dim i As Integer
        Dim y, yy As Integer
        Dim c As String
        file = New FileStream("Contactos.txt", FileMode.Open, FileAccess.ReadWrite)
        b2 = New BinaryWriter(file)
        b1 = New BinaryReader(file)
        If b1.PeekChar <> -1 Then
            For i = 0 To m.Length
                Try
                    b2.Seek(y, SeekOrigin.Begin)
                    c = b1.ReadString
                    If c.Chars(0) = " " Then
                        b2.Write(j(0).nom & j(0).ape & j(0).num & j(0).coEl & j(0).notas)
                    End If
                Catch ex As EndOfStreamException
                    b2.Write(j(0).nom & j(0).ape & j(0).num & j(0).coEl & j(0).notas)
                End Try
                c = Nothing
                yy += 1
                y = yy * 250
            Next
        Else
            b2.Write(j(0).nom & j(0).ape & j(0).num & j(0).coEl & j(0).notas)
        End If
        tt = 0
        b1.Close()
        b2.Close()
        file.Close()
    End Sub
    Private Sub btnAnterior_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAnterior.Click
        añadir(e)
        Try
            If t > 0 Then
                t -= 1
                txtNombre.Text = m(t).nom
                txtApellido.Text = m(t).ape
                txtTelefo.Text = m(t).num
                txtCoreElec.Text = m(t).coEl
                txtNotas.Text = m(t).notas
                btnSiguie.Enabled = True
                Label12.Text = t + 1
                If t = 0 Then
                    btnAnterior.Enabled = False
                End If
            End If
        Catch ex As NullReferenceException
            Exit Sub
        End Try
    End Sub
    Private Sub btnNuevo_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnNuevo.Click
        añadir(e)
        Form2.Show()
    End Sub
    Public Sub añadir(ByVal e As System.EventArgs)
        If Form2.ff = True Then
            Form2.f = True
            Form2.ff = False
            Form2.btnSi_Click(Form2.btnSi, e)
            Form2.f = False
        End If
    End Sub
    Private Sub btnBuscar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBuscar.Click
        añadir(e)
        Dim cad As String
        Dim i As Integer
        Dim f As Boolean
        Select Case ComboBox1.Text
            Case "Nombre"
                If txtBuscar.Text = "" Then
                    MessageBox.Show("Primero escriba un nombre")
                Else
                    cad = txtBuscar.Text
                    For i = 0 To m.Length - 1
                        If cad = m(i).nom Then
                            txtNombre.Text = m(i).nom
                            txtApellido.Text = m(i).ape
                            txtTelefo.Text = m(i).num
                            txtCoreElec.Text = m(i).coEl
                            txtNotas.Text = m(i).notas
                            f = True
                        End If
                    Next
                    If f = False Then
                        MessageBox.Show("No se encuentra ningun contacto con ese nombre", "No existe")
                    End If
                End If
            Case "Apellidos"
                If txtBuscar.Text = "" Then
                    MessageBox.Show("Primero escriba un apellido")
                Else
                    cad = txtBuscar.Text
                    For i = 0 To m.Length - 1
                        If cad = m(i).ape Then
                            txtNombre.Text = m(i).nom
                            txtApellido.Text = m(i).ape
                            txtTelefo.Text = m(i).num
                            txtCoreElec.Text = m(i).coEl
                            txtNotas.Text = m(i).notas
                            f = True
                        End If
                    Next
                    If f = False Then
                        MessageBox.Show("No se encuentra ningun contacto con ese apellido", "No existe")
                    End If
                End If
            Case "Telefono"
                If txtBuscar.Text = "" Then
                    MessageBox.Show("Primero escriba un numero de telefono")
                Else
                    cad = txtBuscar.Text
                    For i = 0 To m.Length - 1
                        If cad = m(i).num Then
                            txtNombre.Text = m(i).nom
                            txtApellido.Text = m(i).ape
                            txtTelefo.Text = m(i).num
                            txtCoreElec.Text = m(i).coEl
                            txtNotas.Text = m(i).notas
                            f = True
                        End If
                    Next
                    If f = False Then
                        MessageBox.Show("No se encuentra ningun contacto con ese numero de telefono", "No existe")
                    End If
                End If
            Case "E-Mail"
                If txtBuscar.Text = "" Then
                    MessageBox.Show("Primero escriba un E-Mail")
                Else
                    cad = txtBuscar.Text
                    For i = 0 To m.Length - 1
                        If cad = m(i).coEl Then
                            txtNombre.Text = m(i).nom
                            txtApellido.Text = m(i).ape
                            txtTelefo.Text = m(i).num
                            txtCoreElec.Text = m(i).coEl
                            txtNotas.Text = m(i).notas
                            f = True
                        End If
                    Next
                    If f = False Then
                        MessageBox.Show("No se encuentra ningun contacto con ese E-Mail", "No existe")
                    End If
                End If
        End Select
        txtBuscar.Text = ""
        ComboBox1.Text = ""
    End Sub
    Private Sub btnElimi_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnElimi.Click
        Dim file As FileStream
        Dim f1 As BinaryReader
        Dim f2 As BinaryWriter
        Dim s As String
        file = New FileStream("Contactos.txt", FileMode.Open, FileAccess.ReadWrite)
        f1 = New BinaryReader(file)
        f2 = New BinaryWriter(file)
        Len(s)
        f1.ReadString()
        file.Close()
        f1.Close()
    End Sub
    Private Sub btnSalir_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSalir.Click
        añadir(e)
        If Form2.t <> 0 Then
            Form3.Show()
        Else
            Me.Close()
        End If
    End Sub
End Class
