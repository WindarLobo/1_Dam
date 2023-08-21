Imports System.IO
Public Class Form1
    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLeer.Click
        Dim file As FileStream
        Dim br As BinaryReader
        Dim entero As Integer
        Dim real As Double
        file = New FileStream("Archivo de Datos.bin", FileMode.Open, FileAccess.Read)
        br = New BinaryReader(file)
        While br.PeekChar <> -1
            entero += br.ReadInt32()
        End While
        file.Seek(0, 0)
        While br.PeekChar <> -1
            real += br.ReadDouble
        End While
        br.Close()
        file.Close()
        txtMues.Text = "Suma de los enteros: " & entero.ToString & vbCrLf & "Suma de los reales: " & real.ToString
    End Sub
End Class
