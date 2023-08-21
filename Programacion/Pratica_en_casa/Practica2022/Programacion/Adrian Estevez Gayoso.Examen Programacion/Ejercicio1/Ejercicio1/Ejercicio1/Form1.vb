Imports System.IO
Public Class Form1
    Dim arc, a As String
    Dim cantCarac, cantParra As Integer
    Dim y As Integer
    Private Sub btnAbrir_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAbrir.Click
        Open.ShowDialog()
        arc = Open.FileName
        a = Open.SafeFileName
        btnArchi.Enabled = True
        btnContrl.Enabled = True
        cantCarac = Nothing
        cantParra = Nothing
        y = Nothing
    End Sub
    Private Sub TextBox1_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtMostrar.TextChanged
    End Sub
    Private Sub btnContrl_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnContrl.Click
        contar()
        btnContrl.Enabled = False
        btnArchi.Enabled = False
        txtMostrar.Text = "Cantidad de Caracteres " & cantCarac.ToString & vbCrLf & "Cantidad de Palabras: " & y & vbCrLf & "Cantidad de Parrafos: " & cantParra
    End Sub
    Public Sub contar()
        Dim cadena As String = Nothing
        Dim file As FileStream = Nothing
        Dim br As StreamReader = Nothing
        Try
            file = New FileStream(arc, FileMode.Open, FileAccess.Read)
            br = New StreamReader(file)
            cantCarac = 0
            cantParra = 0
            While br.Peek <> -1
                cadena &= br.ReadLine
                For i = 0 To cadena.Length - 2
                    If cadena.Chars(i) = " " And cadena.Chars(i + 1) <> " " Then
                        y = y + 1
                    End If
                    cantCarac += 1
                Next
                y += 1
                cantCarac += 1
                cadena = Nothing
                cantParra += 1
            End While
            br.Close()
            file.Close()
        Catch s As FileNotFoundException
            MessageBox.Show("Primero elija un archivo")
        End Try
        
    End Sub
    Private Sub btnArchi_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnArchi.Click
        contar()
        btnArchi.Enabled = False
        btnContrl.Enabled = False
        Dim cad As String
        Dim file2 As FileStream
        Dim sw As StreamWriter
        cad &= "Resumen_" & a
        ''Este archivo siempre se genera en la carpeta del proyecto
        file2 = New FileStream(cad, FileMode.Create, FileAccess.Write)
        sw = New StreamWriter(file2)
        sw.Write("Nombre: " & a & vbCrLf & "Fecha: " & Date.Now.Date & vbCrLf & "Cantidad de Caracteres: " & cantCarac & vbCrLf & "Cantidad de Palabbras: " & y & vbCrLf & "Cantidad de Párrafos: " & cantParra)
        sw.Close()
        file2.Close()
    End Sub

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub
End Class
