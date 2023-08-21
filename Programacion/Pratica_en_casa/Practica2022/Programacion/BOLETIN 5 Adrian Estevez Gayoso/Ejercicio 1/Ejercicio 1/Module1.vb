
Module Module1
    Public Function restamat(ByRef mat(,) As Integer, ByRef mat2(,) As Integer)
        Dim restaresult(3, 3) As Integer
        For i = 0 To mat.GetLength(0) - 1
            For e = 0 To mat2.GetLength(1) - 1
                restaresult(i, e) = mat(i, e) - mat2(i, e)
            Next e
        Next i
        Return restaresult
    End Function
    Public Function sumamat(ByRef mat(,) As Integer, ByRef mat2(,) As Integer)
        Dim sumaresult(3, 3) As Integer
        For i = 0 To mat.GetLength(0) - 1
            For e = 0 To mat2.GetLength(1) - 1
                sumaresult(i, e) = mat(i, e) + mat2(i, e)
            Next e
        Next i
        Return sumaresult
    End Function
    Public Sub matriz(ByRef mat(,) As Integer)
        Dim i, e As Integer
        For i = 0 To mat.GetLength(0) - 1
            For e = 0 To mat.GetLength(1) - 1
                mat(i, e) = Convert.ToInt16(Console.ReadLine())
            Next e
        Next i
    End Sub

    Sub Main()
        Console.WriteLine("SUMA o RESTA de DOS MATRICES")
        Dim str As String
        Dim mat1(3, 3), mat2(3, 3) As Integer
        Dim resultsuma(3, 3), resultresta(3, 3) As Integer
        Dim operacion As String
        Console.WriteLine("Introduzca la operacion a realizar:suma o resta")
        operacion = Console.ReadLine()
        Console.WriteLine("Escriba los elementos de la primera matriz")
        matriz(mat1)
        Console.WriteLine("Escriba los elementos de la segunda matriz")
        matriz(mat2)
        If operacion = "suma" Then
            resultsuma = sumamat(mat1, mat2)
            Console.WriteLine("El resultado de la suma de las dos matrices es:")
            For i = 0 To resultsuma.GetLength(0) - 1
                For e = 0 To resultsuma.GetLength(1) - 1
                    Console.Write(resultsuma(i, e))
                    Console.Write(" ")
                Next e
                Console.ReadLine()
            Next i
        ElseIf operacion = "resta" Then
            resultresta = restamat(mat1, mat2)
            Console.WriteLine("El resultado de la resta de las dos matrices es:")
            For i = 0 To resultresta.GetLength(0) - 1
                For e = 0 To resultresta.GetLength(1) - 1
                    Console.Write(resultresta(i, e))
                    Console.Write(" ")
                Next e
                Console.ReadLine()
            Next i
        Else
            Console.WriteLine("La operacion introducida es incorecta")
        End If
        Console.ReadLine()
    End Sub
End Module
