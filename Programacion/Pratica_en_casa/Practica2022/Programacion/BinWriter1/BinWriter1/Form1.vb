Imports System.IO

Public Class Form1

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim bw As BinaryWriter = Nothing
        Dim fs As FileStream = Nothing

        fs = New FileStream("file.bin", FileMode.Create, FileAccess.Write)
        bw = New BinaryWriter(fs)

        bw.Write("Un nombre")
        bw.Write("A"c)
        bw.Write(94233445L)
        bw.Close()
    End Sub
End Class
