Module Module1
    Public Function mult(ByRef mat1(,) As Integer, ByRef mat2(,) As Integer)
        Dim e, i, result(1, 1) As Integer
        For i = 0 To mat1.GetLength(0) - 1
            For e = 0 To mat2.GetLength(1) - 1
                result(i, e) = mat1(i, e) * mat2(i, e)
            Next
        Next
        Return result
    End Function
    Public Sub matriz(ByRef mat(,) As Integer)
        Dim e, i As Integer
        For i = 0 To mat.GetLength(0) - 1
            For e = 0 To mat.GetLength(1) - 1
                mat(i, e) = Convert.ToInt16(Console.ReadLine())
            Next e
        Next i
    End Sub
    Sub Main()
        Console.WriteLine("MULTIPLICACION de dos MATRICES")
        Dim str As String
        Dim mat(1, 1), mat2(1, 1), result(1, 1) As Integer
        Dim i, e As Integer
        Console.WriteLine("Introduzca los elementos de la primera matriz:")
        matriz(mat)
        Console.WriteLine("Introduzca los elementos de la segunda matriz:")
        matriz(mat2)
        result = mult(mat, mat2)
        Console.WriteLine("El resultado de la multiplicacion entre las dos matrices es:")
        For i = 0 To result.GetLength(0) - 1
            For e = 0 To result.GetLength(1) - 1
                Console.Write(result(i, e))
                Console.Write(" ")
            Next
            Console.ReadLine()
        Next
        Console.ReadLine()
    End Sub
End Module
