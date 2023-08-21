Module Module1
    Public Function resta(ByRef mat(,) As Integer, ByVal num As Integer)
        Dim result(3, 3) As Integer
        For i = 0 To mat.GetLength(0) - 1
            For e = 0 To mat.GetLength(1) - 1
                result(i, e) = mat(i, e) - num
            Next e
        Next i
        Return result
    End Function
    Public Function suma(ByRef mat(,) As Integer, ByVal num As Integer)
        Dim result(3, 3) As Integer
        For i = 0 To mat.GetLength(0) - 1
            For e = 0 To mat.GetLength(1) - 1
                result(i, e) = mat(i, e) + num
            Next e
        Next i
        Return result
    End Function
    Public Sub matriz(ByRef mat(,) As Integer)
        Dim i, e As Integer
        Dim str As String
        For i = 0 To mat.GetLength(0) - 1
            For e = 0 To mat.GetLength(1) - 1
                mat(i, e) = Convert.ToInt16(Console.ReadLine())
            Next e
        Next i
    End Sub
    Sub Main()
        Console.WriteLine("SUMA o RESTA de una MATRIZ y una CONSTANTE")
        Dim str As String
        Dim num, mat1(3, 3), result(3, 3) As Integer
        Console.WriteLine("Escriba la operacion a realizar:suma o resta")
        str = Console.ReadLine()
        Console.WriteLine("Escriba los elementos de la matriz:")
        matriz(mat1)
        Console.WriteLine("Escriba la constante deseada:")
        num = Convert.ToInt16(Console.ReadLine())
        If str = "suma" Then
            result = suma(mat1, num)
            Console.WriteLine("El resultado de la suma es:")
            For i = 0 To result.GetLength(0) - 1
                For e = 0 To result.GetLength(1) - 1
                    Console.Write(result(i, e))
                    Console.Write(" ")
                Next e
                Console.ReadLine()
            Next i
        ElseIf str = "resta" Then
            result = resta(mat1, num)
            Console.WriteLine("El resultado de la resta es:")
            For i = 0 To result.GetLength(0) - 1
                For e = 0 To result.GetLength(1) - 1
                    Console.Write(result(i, e))
                    Console.Write(" ")
                Next e
                Console.ReadLine()
            Next i
        Else
            Console.WriteLine("Operacion incorrecta")
        End If
        Console.ReadLine()
    End Sub

End Module
