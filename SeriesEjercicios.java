public class SeriesEjercicios {

    //18 DE ABRIL
    // =====================================================
    // FUNCIÓN AUXILIAR PARA SABER SI UN NÚMERO ES PRIMO
    // =====================================================
    // Lógica:
    // Un número primo solo es divisible entre 1 y él mismo.
    // Aquí revisamos si tiene divisores desde 2 hasta sqrt(n).
    // Si encontramos uno, no es primo.
    public static boolean esPrimo(int x) {
        if (x < 2) return false;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Helper para imprimir double sin .0 innecesario
    public static String formatearDouble(double valor) {
        if (valor == (long) valor) {
            return String.valueOf((long) valor);
        }
        return String.valueOf(valor);
    }

    // =====================================================
    // EJERCICIO 1
    // Serie: 4, 5, 9, 14, 23, 37, 60, 97, 157, 254, 411, 665...
    // Lógica:
    // Es una serie tipo Fibonacci.
    // Cada término es la suma de los dos anteriores.
    // Para usar la lógica pedida:
    // a = 3, b = 1
    // c = a + b -> 4
    // luego 1 + 4 = 5, luego 4 + 5 = 9...
    // =====================================================
    public static void ejercicio1(int n) {
        int a = 3, b = 1, c;

        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(c + " , ");
            a = b;
            b = c;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 2
    // Serie: 60, 1, 58, 3, 56, 5, 54, 7, 52, 9, 50, 11...
    // Lógica:
    // Se intercalan dos series:
    // - una descendente de números pares: 60, 58, 56...
    // - una ascendente de números impares: 1, 3, 5...
    // =====================================================
    public static void ejercicio2(int n) {
        int grande = 60, pequeno = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(grande + " , ");
                grande -= 2;
            } else {
                System.out.print(pequeno + " , ");
                pequeno += 2;
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 3
    // Serie: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
    // Lógica:
    // Serie Fibonacci clásica.
    // Se usan valores previos ocultos:
    // a = 1, b = 0
    // c = a + b -> 1
    // luego 0 + 1 = 1
    // luego 1 + 1 = 2 ...
    // =====================================================
    public static void ejercicio3(int n) {
        int a = 1, b = 0, c;

        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(c + " , ");
            a = b;
            b = c;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 4
    // Serie: 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11...
    // Lógica:
    // Si la posición es impar, se imprime i+1
    // Si la posición es par, se imprime i-1
    // Así se van invirtiendo pares e impares.
    // =====================================================
    public static void ejercicio4(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print((i + 1) + " , ");
            } else {
                System.out.print((i - 1) + " , ");
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 5
    // Serie: 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132...
    // Lógica:
    // Cada término sigue la fórmula n(n+1)
    // Si n=0 -> 0
    // Si n=1 -> 2
    // Si n=2 -> 6
    // =====================================================
    public static void ejercicio5(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((i * (i + 1)) + " , ");
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 6
    // Serie: 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144...
    // Lógica:
    // Son cuadrados perfectos: n^2
    // =====================================================
    public static void ejercicio6(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " , ");
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 7
    // Serie: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31...
    // Lógica:
    // El ejemplo incluye el 1 y luego siguen números primos.
    // Aunque 1 no es primo matemáticamente, aquí se respeta
    // el patrón dado por el ejercicio.
    // =====================================================
    public static void ejercicio7(int n) {
        int contador = 0;
        int num = 2;

        if (n >= 1) {
            System.out.print(1 + " , ");
            contador++;
        }

        while (contador < n) {
            if (esPrimo(num)) {
                System.out.print(num + " , ");
                contador++;
            }
            num++;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 8
    // Serie: 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0...
    // Lógica:
    // Alternancia simple entre 1 y 0
    // =====================================================
    public static void ejercicio8(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(1 + " , ");
            } else {
                System.out.print(0 + " , ");
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 9
    // Serie: 1, 2, 3, 6, 7, 14, 15, 30, 31, 62, 63, 126...
    // Lógica:
    // Se alternan dos operaciones:
    // posición impar -> multiplicar por 2
    // posición par   -> sumar 1
    // =====================================================
    public static void ejercicio9(int n) {
        int valor = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");

            if (i % 2 != 0) {
                valor *= 2;
            } else {
                valor += 1;
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 10
    // Serie: 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2...
    // Lógica:
    // Se generan bloques crecientes:
    // bloque 1: 1
    // bloque 2: 1,2
    // bloque 3: 1,2,3
    // =====================================================
    public static void ejercicio10(int n) {
        int contador = 0;

        for (int bloque = 1; contador < n; bloque++) {
            for (int i = 1; i <= bloque && contador < n; i++) {
                System.out.print(i + " , ");
                contador++;
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 11
    // Serie: 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2...
    // Lógica:
    // Igual al ejercicio 10
    // =====================================================
    public static void ejercicio11(int n) {
        int contador = 0;

        for (int bloque = 1; contador < n; bloque++) {
            for (int i = 1; i <= bloque && contador < n; i++) {
                System.out.print(i + " , ");
                contador++;
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 12
    // Serie: 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34...
    // Lógica:
    // Progresión aritmética con diferencia +3
    // =====================================================
    public static void ejercicio12(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((1 + 3 * i) + " , ");
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 13
    // Serie: 3, 8, 13, 18, 23, 28, 33, 38, 43, 48, 53, 58...
    // Lógica:
    // Progresión aritmética con diferencia +5
    // =====================================================
    public static void ejercicio13(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((3 + 5 * i) + " , ");
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 14
    // Serie: 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441...
    // Lógica:
    // Potencias de 3
    // Cada término se obtiene multiplicando por 3
    // =====================================================
    public static void ejercicio14(int n) {
        long valor = 3;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");
            valor *= 3;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 15
    // Serie: 1, 8, 27, 64, 125, 216, 343, 512, 729, 1000, 1331, 1728...
    // Lógica:
    // Cubos perfectos: n^3
    // =====================================================
    public static void ejercicio15(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " , ");
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 16
    // Serie: 4, 2, 1, 0.5, 0.25, 0.125, 0.0625, 0.03125, 0.015625, 0.0078125, 0.00390625, 0.001953125...
    // Lógica:
    // Cada término se divide entre 2
    // =====================================================
    public static void ejercicio16(int n) {
        double valor = 4;

        for (int i = 1; i <= n; i++) {
            System.out.print(formatearDouble(valor) + " , ");
            valor /= 2;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 17
    // Serie:
    // Si n=8 -> 0, 1, 7, 2, 6, 3, 5, 4
    // Si n=7 -> 7, 1, 6, 2, 5, 3, 4
    // Lógica:
    // Para n par, arranca desde 0 y alterna extremo bajo/alto.
    // Para n impar, arranca desde n y alterna alto/bajo.
    // =====================================================
    public static void ejercicio17(int n) {
        if (n % 2 == 0) {
            int bajo = 0;
            int alto = n - 1;

            System.out.print(bajo + " , ");
            bajo++;

            while (bajo <= alto) {
                System.out.print(bajo + " , ");
                bajo++;

                if (bajo <= alto) {
                    System.out.print(alto + " , ");
                    alto--;
                }
            }
        } else {
            int alto = n;
            int bajo = 1;

            while (bajo < alto) {
                System.out.print(alto + " , ");
                alto--;

                System.out.print(bajo + " , ");
                bajo++;
            }

            if (bajo == alto) {
                System.out.print(bajo + " , ");
            }
        }

        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 18
    // Serie: 1, 20, 3, 18, 5, 16, 7, 14, 9, 12, 11, 10...
    // Lógica:
    // Se intercalan:
    // - impares ascendentes: 1, 3, 5, 7...
    // - pares descendentes desde 20: 20, 18, 16...
    // =====================================================
    public static void ejercicio18(int n) {
        int a = 1, b = 20;
        if (n > 22) {
            System.out.print("Error .....");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.print(a + " , ");
                    a += 2;
                } else {
                    System.out.print(b + " , ");
                    b -= 2;
                }
            }
        }
        System.out.println();
    }

    // =====================================================
    // EJERCICIO 19
    // Serie: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048...
    // Lógica:
    // Potencias de 2
    // Nota: el enunciado decía (n²), pero no coincide.
    // Aquí se sigue la serie visible.
    // =====================================================
    public static void ejercicio19(int n) {
        long valor = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");
            valor *= 2;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 20
    // Serie: 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 1, 2...
    // Lógica:
    // Se arma una subida y bajada, reduciendo el máximo.
    // =====================================================
    public static void ejercicio20() {
        for (int maximo = 5; maximo >= 1; maximo--) {
            for (int i = 1; i <= maximo; i++) {
                System.out.print(i + " , ");
            }

            for (int i = maximo; i >= 1; i--) {
                System.out.print(i + " , ");
            }
        }

        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 21
    // Serie: -1, 1, -2, 3, -5, 8, -13, 21, -34, 55, -89, 144...
    // Lógica:
    // La magnitud sigue Fibonacci.
    // El signo alterna: negativo, positivo, negativo...
    // Usamos previos ocultos a=1, b=0
    // =====================================================
    public static void ejercicio21(int n) {
        int a = 1, b = 0, c;

        for (int i = 1; i <= n; i++) {
            c = a + b;

            if (i % 2 != 0) {
                System.out.print((-c) + " , ");
            } else {
                System.out.print(c + " , ");
            }

            a = b;
            b = c;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 22
    // Serie: 1, 3, 6, 8, 16, 18, 36, 38, 76, 78, 156, 158...
    // Lógica:
    // Se alternan dos operaciones:
    // +2, luego x2, luego +2, luego x2...
    // =====================================================
    public static void ejercicio22(int n) {
        int valor = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");

            if (i % 2 != 0) {
                valor += 2;
            } else {
                valor *= 2;
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 23
    // Serie: 1, 3, 2, 6, 6, 9, 24, 12, 96, 15, 384, 18...
    // Lógica asumida:
    // posiciones pares: múltiplos de 3 -> 3, 6, 9, 12...
    // posiciones impares: 1, 2, 6, 24, 96...
    // En la parte impar se va multiplicando progresivamente.
    // Esta serie viene media sospechosa de fábrica, así que aquí
    // se reproduce con una regla práctica.
    // =====================================================
    public static void ejercicio23(int n) {
        int impar = 1;
        int par = 3;
        int mult = 2;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(impar + " , ");
                impar *= mult;
                if (mult < 4) mult++;
            } else {
                System.out.print(par + " , ");
                par += 3;
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 24
    // Serie: 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000...
    // Lógica:
    // Potencias de 10
    // =====================================================
    public static void ejercicio24(int n) {
        long valor = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");
            valor *= 10;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 25
    // Serie: 1, -3, 9, -13, 25, -31, 49, -57, 81, -91, 121, -133...
    // Lógica asumida:
    // positivos -> cuadrados impares: 1, 9, 25, 49...
    // negativos -> se generan con: (i*i - s) * -1
    // =====================================================
    public static void ejercicio25(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(((i * i - s) * -1) + " , ");
                s += 2;
            } else {
                System.out.print((i * i) + " , ");
            }
        }
        System.out.println();
    }

    // =====================================================
    // EJERCICIO 26
    // Serie: 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2...
    // Lógica:
    // Igual al ejercicio 10
    // =====================================================
    public static void ejercicio26(int n) {
        int contador = 0;

        for (int bloque = 1; contador < n; bloque++) {
            for (int i = 1; i <= bloque && contador < n; i++) {
                System.out.print(i + " , ");
                contador++;
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 27
    // Serie: 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37...
    // Lógica:
    // Progresión aritmética con diferencia +3
    // =====================================================
    public static void ejercicio27(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((4 + 3 * i) + " , ");
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 28
    // Serie: 8, 9, 11, 14, 18, 23, 29, 36, 44, 53, 63, 74...
    // Lógica:
    // Se va sumando 1, luego 2, luego 3, luego 4...
    // =====================================================
    public static void ejercicio28(int n) {
        int valor = 8;
        int suma = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");
            valor += suma;
            suma++;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 29
    // Serie: 4, 4, 8, 24, 96, 480, 2880, 20160, 161280, 1451520, 14515200, 159667200...
    // Lógica:
    // Se multiplica por 1, luego por 2, luego por 3, luego por 4...
    // =====================================================
    public static void ejercicio29(int n) {
        int valor = 4;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");
            valor *= i;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 30
    // Serie: 1, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77...
    // Lógica asumida:
    // El primer término es 1
    // Luego siguen múltiplos de 7
    // =====================================================
    public static void ejercicio30(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(1 + " , ");
            } else {
                System.out.print((7 * (i - 1)) + " , ");
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 31
    // Serie: 1, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096...
    // Lógica asumida:
    // Primer término 1
    // Luego se comienza en 4 y se duplica
    // =====================================================
    public static void ejercicio31(int n) {
        int valor = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");

            if (i == 1) {
                valor = 4;
            } else {
                valor *= 2;
            }
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 32
    // Serie: 8, 13, 23, 38, 58, 83, 113, 148, 188, 233, 283, 338...
    // Lógica:
    // Se suma 5, luego 10, luego 15, luego 20...
    // =====================================================
    public static void ejercicio32(int n) {
        int valor = 8;
        int suma = 5;

        for (int i = 1; i <= n; i++) {
            System.out.print(valor + " , ");
            valor += suma;
            suma += 5;
        }
        System.out.println("...");
    }

    // =====================================================
    // EJERCICIO 33
    // Serie: 6, 8, 14, 22, 36, 58, 94, 152, 246, 398, 644, 1042...
    // Lógica:
    // Serie tipo Fibonacci
    // previos ocultos: a=4, b=2
    // c = a + b -> 6
    // luego 2 + 6 = 8
    // luego 6 + 8 = 14...
    // =====================================================
    public static void ejercicio33(int n) {
        int a = 4, b = 2, c;

        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(c + " , ");
            a = b;
            b = c;
        }
        System.out.println("...");
    }

    // =====================================================
    // FUNCIÓN PRINCIPAL
    // =====================================================
    public static void main(String[] args) {
        System.out.print("Ejercicio 1: ");  ejercicio1(6);
        System.out.print("Ejercicio 2: ");  ejercicio2(12);
        System.out.print("Ejercicio 3: ");  ejercicio3(7);
        System.out.print("Ejercicio 4: ");  ejercicio4(10);
        System.out.print("Ejercicio 5: ");  ejercicio5(5);
        System.out.print("Ejercicio 6: ");  ejercicio6(5);
        System.out.print("Ejercicio 7: ");  ejercicio7(8);
        System.out.print("Ejercicio 8: ");  ejercicio8(9);
        System.out.print("Ejercicio 9: ");  ejercicio9(7);
        System.out.print("Ejercicio 10: "); ejercicio10(15);
        System.out.print("Ejercicio 11: "); ejercicio11(21);
        System.out.print("Ejercicio 12: "); ejercicio12(9);
        System.out.print("Ejercicio 13: "); ejercicio13(8);
        System.out.print("Ejercicio 14: "); ejercicio14(7);
        System.out.print("Ejercicio 15: "); ejercicio15(9);
        System.out.print("Ejercicio 16: "); ejercicio16(5);
        System.out.print("Ejercicio 17 (n=8): "); ejercicio17(8);
        System.out.print("Ejercicio 17 (n=7): "); ejercicio17(7);
        System.out.print("Ejercicio 18: "); ejercicio18(22);
        System.out.print("Ejercicio 19: "); ejercicio19(8);
        System.out.print("Ejercicio 20: "); ejercicio20();
        System.out.print("Ejercicio 21: "); ejercicio21(10);
        System.out.print("Ejercicio 22: "); ejercicio22(7);
        System.out.print("Ejercicio 23: "); ejercicio23(9);
        System.out.print("Ejercicio 24: "); ejercicio24(6);
        System.out.print("Ejercicio 25: "); ejercicio25(6);
        System.out.print("Ejercicio 26: "); ejercicio26(10);
        System.out.print("Ejercicio 27: "); ejercicio27(6);
        System.out.print("Ejercicio 28: "); ejercicio28(5);
        System.out.print("Ejercicio 29: "); ejercicio29(5);
        System.out.print("Ejercicio 30: "); ejercicio30(5);
        System.out.print("Ejercicio 31: "); ejercicio31(5);
        System.out.print("Ejercicio 32: "); ejercicio32(5);
        System.out.print("Ejercicio 33: "); ejercicio33(5);
    }
}