Imports System.IO
Public Class Form1
    Public Structure contact
        Dim nom, ape, coEl, num, notas As String
    End Structure
    Public m(), mNue() As contact
    Dim i As Integer
    Public t, n, o As Integer
    Public Function carga(ByRef m() As contact) As Boolean
        Dim file As FileStream
        Dim cad(4), c As String
        Dim f As Boolean
        Dim f1 As StreamReader
        file = New FileStream("Contactos.txt", FileMode.Open, FileAccess.Read)
        f1 = New StreamReader(File)
        If file.Length = 0 Then
            f = False
        Else
            While f1.Peek <> -1
                c = f1.ReadLine
                If c <> "" Then
                    cad = c.Split("*")
                    ReDim Preserve m(o)
                    m(o).nom = cad(0)
                    m(o).ape = cad(1)
                    m(o).num = cad(2)
                    m(o).coEl = cad(3)
                    m(o).notas = cad(4)
                    o += 1
                    f = True
                End If
            End While
            f1.Close()
            file.Close()
            Return f
        End If
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
        btnGuardar.Enabled = False

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
        Dim f1 As StreamWriter
        Dim f2 As StreamReader
        Dim file As FileStream
        Dim i As Integer
        file = New FileStream("Contactos.txt", FileMode.Open, FileAccess.ReadWrite)
        f1 = New StreamWriter(file)
        f2 = New StreamReader(file)
        If file.Length = 0 Then
            For i = 0 To mNue.Length - 1
                f1.Write(mNue(i).nom & "*" & mNue(i).ape & "*" & mNue(i).num & "*" & mNue(i).coEl & "*" & mNue(i).notas & vbCrLf)
                Form2.t = 0
            Next
        Else
            f2.ReadLine()
            For i = 0 To mNue.Length - 1
                f1.WriteLine(mNue(i).nom & "*" & mNue(i).ape & "*" & mNue(i).num & "*" & mNue(i).coEl & "*" & mNue(i).notas)
                Form2.t = 0
            Next
        End If
        btnGuardar.Enabled = False
        f1.Close()
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
        aa()
    End Sub

    Public Sub aa()
        Dim file As FileStream
        Dim f As BinaryReader
        Dim f2 As BinaryWriter
        Dim c, s() As Char
        Dim n() As Byte
        Dim str As String
        Dim j As Byte
        file = New FileStream("Contactos.txt", FileMode.Open, FileAccess.Read)
        f = New BinaryReader(file)
        c = "m"
        s = "u"
        j = 5
        For i = 0 To file.Length
            For t = i To j
                ReDim Preserve n(t)
                n(t) = f.ReadByte

            Next
            Exit For
            i = j
            j += 10

        Next
        For i = 0 To n.Length - 1
            c = Chr(n(i))
            str &= c
        Next
        file.Close()
        f.Close()

    End Sub
End Class
