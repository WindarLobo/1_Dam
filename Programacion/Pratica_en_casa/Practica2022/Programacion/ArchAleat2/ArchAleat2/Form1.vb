Imports System.IO

Public Class Form1
    Public Structure FAleat
        Dim x As Integer
        Dim j As Single
        Dim s As String
    End Structure

    Private struc(5) As FAleat

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim fs As FileStream = Nothing
        Dim bw As BinaryWriter = Nothing
        Dim i As Integer

        fs = New FileStream("Ejemplo FAleat.fil", FileMode.OpenOrCreate, FileAccess.Write)
        bw = New BinaryWriter(fs)

        struc(0).x = 48
        struc(0).j = 1.1
        struc(0).s = "Juan"
        struc(1).x = 49
        struc(1).j = 2.2
        struc(1).s = "Pedro"
        struc(2).x = 50
        struc(2).j = 3.3
        struc(2).s = "Luis"
        struc(3).x = 51
        struc(3).j = 4.4
        struc(3).s = "Miguel"
        struc(4).x = 52
        struc(4).j = 5.5
        struc(4).s = "Jose"
        struc(5).x = 53
        struc(5).j = 6.6
        struc(5).s = "Manuel"
        For i = 0 To struc.Count - 1
            bw.Write(struc(i).x)
            bw.Write(struc(i).j)
            bw.Write(struc(i).s.PadRight(10))       ' Normaliza la longitud de la cadena
        Next
        bw.Close()
        fs.Close()
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        Dim fs As FileStream = Nothing
        Dim br As BinaryReader = Nothing
        Dim i As Integer

        fs = New FileStream("Ejemplo FAleat.fil", FileMode.Open, FileAccess.Read)
        br = New BinaryReader(fs)

        txtResult.Clear()
        For i = 0 To struc.Count - 1
            struc(i).x = br.ReadInt32()
            txtResult.Text &= struc(i).x.ToString & vbCrLf
            struc(i).j = br.ReadSingle()
            txtResult.Text &= struc(i).j.ToString & vbCrLf
            struc(i).s = br.ReadString()
            txtResult.Text &= struc(i).s & vbCrLf
        Next
        br.Close()
        fs.Close()
    End Sub

    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        Dim fs As FileStream = Nothing
        Dim br As BinaryReader = Nothing
        Dim x, pos As Integer
        Dim j As Single
        Dim s As String
        Dim n As Integer = 1    'Tercer campo n = 2

        fs = New FileStream("Ejemplo FAleat.fil", FileMode.Open, FileAccess.Read)
        br = New BinaryReader(fs)

        'Calcula la posición del tercer campo (n = 2)
        'Cada campo tiene un entero (4 bytes), un single (4 bytes) y una cadena de 10 caracteres (10 bytes + uno para la longitud)
        'En total cada campo tiene 19 bytes
        pos = n * (Len(struc(0).x) + Len(struc(0).j) + 11)    'No se puede utilizar Len(s) porque en VB8 no se admiten string de longitud fija

        br.BaseStream.Seek(pos, SeekOrigin.Begin)

        x = br.ReadInt32()
        j = br.ReadSingle()
        s = br.ReadString()

        br.Close()
        fs.Close()

        txtResult.Clear()
        txtResult.Text &= x.ToString & vbCrLf & j.ToString & vbCrLf & s

    End Sub

    Private Sub Button4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button4.Click
        Dim fs As FileStream = Nothing
        Dim bw As BinaryWriter = Nothing
        Dim pos As Integer

        fs = New FileStream("Ejemplo FAleat.fil", FileMode.Open, FileAccess.Write)
        bw = New BinaryWriter(fs)

        struc(2).x = 555
        struc(2).j = 111.222
        struc(2).s = "Nueva"

        pos = 2 * (Len(struc(2).x) + Len(struc(2).j) + 11)    'No se puede utilizar Len(s) porque en VB8 no se admiten string de longitud fija
        bw.BaseStream.Seek(pos, SeekOrigin.Begin)


        bw.Write(struc(2).x)
        bw.Write(struc(2).j)
        bw.Write(struc(2).s.PadRight(10))       ' Normaliza la longitud de la cadena

        bw.Close()
        fs.Close()
    End Sub

End Class
