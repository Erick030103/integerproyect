import java.util.Scanner;

/**
 * Un proyecto especializado para apoyar a los alumnos de primer año de secundaria y de esta manera
 * Poder tener un mejor rendimiento matemático
 * 
 * @author Keven y Erick
 * @version 13 nov 2020
 */
    public class ProyectoIntegrador
    {
        public static void main(String args[])
        {
            //Variables globales
            int contador;
            int tema;
            int menu;
            System.out.print('\u000c');
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i<100; i++){
                System.out.print('\u000c');
                System.out.println("Programa de apoyo para alumnos de secundaria");
                System.out.println("Pulsa 1 Si quieres continuar");
                System.out.println("Pulsa 0 Si quieres terminar");
                contador = sc.nextInt();
                //Contador para bucle de escoger tema de práctica
                if(contador==1){
                    System.out.print('\u000c');
                    System.out.println("Elige el tema que quieras practicar");
                    System.out.println("[1]Ecuaciones de primer grado");
                    System.out.println("[2]Multiplicación por numeros enteros");
                    System.out.println("[3]Multiplicación de numero decimal");
                    System.out.println("Pulsa otro numero para terminar");
                    tema = sc.nextInt();
                    //[1] Ecuaciones de primer grado 
                    if(tema==1){
                            //Ecuaciones de primer grado
                            int x;
                            System.out.print('\u000c');
                            System.out.println("Ecuaciones de primer grado");
                            System.out.println("Problema 1");
                            System.out.println("Despeja x");
                            System.out.println("x^2-36=0");
                            x = sc.nextInt();
                           if(x==6){
                               System.out.println("Problema resuelto...Buen trabajo");
                              try{
                                  Thread.sleep(2000);
                                }catch(InterruptedException e){}
                            }else{
                                System.out.println("Estos son los pasos que debiste seguir...");
                                System.out.println("x^2-36=0");
                                System.out.println("x^2=36");
                                System.out.println("x=√36");
                                System.out.println("x=6");
                                System.out.println("Debes de seguir practicando");
                                try{
                                    Thread.sleep(15000);
                                }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Problema 2");
                            System.out.println("Despeja x");
                            System.out.println("x^2-9=0");
                            x = sc.nextInt();
                            if(x==3){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                            }else{
                                System.out.println("Estos son los pasos que debiste seguir...");
                                System.out.println("x^2-9=0");
                                System.out.println("x^2=9");
                                System.out.println("x=√9");
                                System.out.println("x=3");
                                System.out.println("Debes de seguir practicando");
                                try{
                                    Thread.sleep(15000);
                                }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Problema 3");
                            System.out.println("Despeja x");
                            System.out.println("x^2-25=0");
                            x = sc.nextInt();
                            if(x==5){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                            }else{
                                System.out.println("Estos son los pasos que debiste seguir...");
                                System.out.println("x^2-25=0");
                                System.out.println("x^2=25");
                                System.out.println("x=√25");
                                System.out.println("x=5");
                                System.out.println("Debes de seguir practicando");
                                try{
                                    Thread.sleep(15000);
                                }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Problema 4");
                            System.out.println("Despeja x");
                            System.out.println("x^2-81=0");
                            x = sc.nextInt();
                            if(x==9){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                            }else{
                                System.out.println("Estos son los pasos que debiste seguir...");
                                System.out.println("x^2-81=0");
                                System.out.println("x^2=81");
                                System.out.println("x=√81");
                                System.out.println("x=9");
                                System.out.println("Debes de seguir practicando");
                                try{
                                    Thread.sleep(15000);
                                }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Problema 5");
                            System.out.println("Despeja x");
                            System.out.println("x^2-64=0");
                            x = sc.nextInt();
                            if(x==8){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                            }else{
                                System.out.println("Estos son los pasos que debiste seguir...");
                                System.out.println("x^2-64=0");
                                System.out.println("x^2=64");
                                System.out.println("x=√64");
                                System.out.println("x=8");
                                System.out.println("Debes de seguir practicando");
                                try{
                                    Thread.sleep(15000);
                                }catch(InterruptedException e){}
                            }
                            System.out.println("Buen trabajo");
                            System.out.println("Pulsa 1 para regresar al menu principal");
                            menu = sc.nextInt();
                            if(menu == 1){
                                System.out.println();
                            }else{
                                System.out.print('\u000c');
                                System.out.println("Programa terminado");
                                return;
                            }
                        //[2]Multiplicación por numeros enteros
                        }else if(tema==2){
                            //Multiplicación de numeros enteros
                            double respuesta;
                            System.out.print('\u000c');
                            System.out.println("Multiplicación por numeros enteros");
                            System.out.println("Problema 1");
                            System.out.println("Resuelve");
                            System.out.println("(-5)(-6)");
                            respuesta = sc.nextDouble();
                            if(respuesta == 30){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                        Thread.sleep(2000);
                                    }catch(InterruptedException e){}
                            }else{
                                System.out.println("La respuesta era");
                                System.out.println("30");
                                System.out.println("Debes de seguir practicando");
                                try{
                                        Thread.sleep(5000);
                                    }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Problema 2");
                            System.out.println("Resuelve");
                            System.out.println("(-8.5)(5)");
                            respuesta = sc.nextDouble();
                            if(respuesta == -42.5){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                        Thread.sleep(2000);
                                    }catch(InterruptedException e){}
                            }else{
                                System.out.println("La respuesta era");
                                System.out.println("-42.5");
                                System.out.println("Debes de seguir practicando");
                                try{
                                        Thread.sleep(5000);
                                    }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Problema 3");
                            System.out.println("Resuelve");
                            System.out.println("(-5)(4)(-8)");
                            respuesta = sc.nextDouble();
                            if(respuesta == 160){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                        Thread.sleep(2000);
                                    }catch(InterruptedException e){}
                            }else{
                                System.out.println("La respuesta era");
                                System.out.println("160");
                                System.out.println("Debes de seguir practicando");
                                try{
                                        Thread.sleep(5000);
                                    }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Problema 4");
                            System.out.println("Resuelve");
                            System.out.println("(-6)(-6)");
                            respuesta = sc.nextDouble();
                            if(respuesta == 36){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                        Thread.sleep(2000);
                                    }catch(InterruptedException e){}
                            }else{
                                System.out.println("La respuesta era");
                                System.out.println("36");
                                System.out.println("Debes de seguir practicando");
                                try{
                                        Thread.sleep(5000);
                                    }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Problema 5");
                            System.out.println("Resuelve");
                            System.out.println("(-2)(5)(1)(-3)");
                            respuesta = sc.nextDouble();
                            if(respuesta == 30){
                                System.out.println("Problema resuelto...Buen trabajo");
                                try{
                                        Thread.sleep(2000);
                                    }catch(InterruptedException e){}
                            }else{
                                System.out.println("La respuesta era");
                                System.out.println("30");
                                System.out.println("Debes de seguir practicando");
                                try{
                                        Thread.sleep(5000);
                                    }catch(InterruptedException e){}
                            }
                            System.out.print('\u000c');
                            System.out.println("Pulsa 1 para regresar al menu principal");
                            menu = sc.nextInt();
                            if(menu == 1){
                                System.out.println();
                            }else{
                                System.out.print('\u000c');
                                System.out.println("Programa terminado");
                                return;
                            }
                    //[3]Multiplicación de numero decimal
                    }else if(tema==3){
                        //Multiplicacion de numero decimal
                        double multDecimal;
                        System.out.print('\u000c');
                        System.out.println("Multiplicación de numero decimal");
                        System.out.println("Problema 1");
                        System.out.println("Resuelve");
                        System.out.println("20 x 100");
                        multDecimal = sc.nextDouble();
                        if(multDecimal == 2000){
                            System.out.println("Problema resuelto...Buen trabajo");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                        }else{
                            System.out.println("La respuesta era");
                                System.out.println("2000");
                                System.out.println("Debes de seguir practicando");
                                try{
                                Thread.sleep(5000);
                            }catch(InterruptedException e){}
                        }
                        System.out.print('\u000c');
                        System.out.println("Problema 2");
                        System.out.println("Resuelve");
                        System.out.println("0.02 x 100");
                        multDecimal = sc.nextDouble();
                        if(multDecimal == 20){
                            System.out.println("Problema resuelto...Buen trabajo");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                        }else{
                            System.out.println("La respuesta era");
                                System.out.println("20");
                                System.out.println("Debes de seguir practicando");
                                try{
                                Thread.sleep(5000);
                            }catch(InterruptedException e){}
                        }
                        System.out.print('\u000c');
                        System.out.println("Problema 3");
                        System.out.println("Resuelve");
                        System.out.println("1.2 x 10");
                        multDecimal = sc.nextDouble();
                        if(multDecimal == 12){
                            System.out.println("Problema resuelto...Buen trabajo");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                        }else{
                            System.out.println("La respuesta era");
                                System.out.println("12");
                                System.out.println("Debes de seguir practicando");
                                try{
                                Thread.sleep(5000);
                            }catch(InterruptedException e){}
                        }
                        System.out.print('\u000c');
                        System.out.println("Problema 4");
                        System.out.println("Resuelve");
                        System.out.println("7 x 1000");
                        multDecimal = sc.nextDouble();
                        if(multDecimal == 7000){
                            System.out.println("Problema resuelto...Buen trabajo");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                        }else{
                            System.out.println("La respuesta era");
                                System.out.println("7000");
                                System.out.println("Debes de seguir practicando");
                                try{
                                Thread.sleep(5000);
                            }catch(InterruptedException e){}
                        }
                        System.out.print('\u000c');
                        System.out.println("Problema 5");
                        System.out.println("Resuelve");
                        System.out.println("0.1 x 0.1");
                        multDecimal = sc.nextDouble();
                        if(multDecimal == .01){
                            System.out.println("Problema resuelto...Buen trabajo");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                        }else{
                            System.out.println("La respuesta era");
                                System.out.println("0.01");
                                System.out.println("Debes de seguir practicando");
                                try{
                                Thread.sleep(5000);
                            }catch(InterruptedException e){}
                        }
                        System.out.println("Pulsa 1 para regresar al menu principal");
                        menu = sc.nextInt();
                        if(menu == 1){
                            System.out.println();
                        }else{
                            System.out.print('\u000c');
                            System.out.println("Programa terminado");
                            return;
                        }
                    }else{        
                        System.out.print('\u000c');
                        System.out.println("Programa terminado");
                        return;
                    }
                }else{
                    System.out.print('\u000c');
                        System.out.println("Programa terminado");
                    return;
                }
            }
        }
    }
