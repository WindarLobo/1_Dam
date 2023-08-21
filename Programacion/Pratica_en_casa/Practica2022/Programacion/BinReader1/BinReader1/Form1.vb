Imports System.IO

Public Class Form1

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim bw As BinaryReader = Nothing
        Dim fs As FileStream = Nothing
        Dim var1 As Byte
        Dim var2 As Char
        Dim var3 As Int16
        Dim var4 As UInt16
        Dim var5 As Single
        Dim var6 As Double

        fs = New FileStream("file1.bin", FileMode.Open, FileAccess.Read)
        bw = New BinaryReader(fs)

        var1 = bw.ReadByte()
        fs.Seek(0, 0)                   'Puntero de lectura apunta al inicio del flujo
        var2 = bw.ReadChar()
        fs.Seek(0, 0)                   'Puntero de lectura apunta al inicio del flujo
        var3 = bw.ReadInt16()
        fs.Seek(0, 0)                   'Puntero de lectura apunta al inicio del flujo
        'var4 = bw.ReadInt16()
        fs.Seek(0, 0)                   'Puntero de lectura apunta al inicio del flujo
        var5 = bw.ReadSingle()
        fs.Seek(0, 0)                   'Puntero de lectura apunta al inicio del flujo
        var6 = bw.ReadDouble()
        bw.Close()
        fs.Close()
    End Sub

    'Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs)
    '    Dim x() As Byte = {1, 6, 20, 100, 255}
    '    Dim i As Integer

    '    For i = 0 To 4
    '        TextBox1.Text &= x(i).ToString("X2") & " "
    '    Next
    'End Sub
End Class
