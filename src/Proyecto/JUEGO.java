package Proyecto;


//PAQUETES
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;


public class JUEGO extends javax.swing.JFrame {

    ArrayList<Integer> arreglos = new ArrayList<Integer>();
    
//    VARIABLES
    int tiempo = 500;
    int puntos = 0;
    int siguiente = 0;
    
    int max = 11;
    int min = 0;
    int rango = max - min;

    public JUEGO() {
        initComponents();
        
//        COLOR BOTONES
        jButton1.setBackground(java.awt.Color.WHITE);
        jButton2.setBackground(java.awt.Color.WHITE);
        jButton3.setBackground(java.awt.Color.WHITE);
        jButton4.setBackground(java.awt.Color.WHITE);
        jButton5.setBackground(java.awt.Color.WHITE);
        jButton6.setBackground(java.awt.Color.WHITE);
        jButton7.setBackground(java.awt.Color.WHITE);
        jButton8.setBackground(java.awt.Color.WHITE);
        jButton9.setBackground(java.awt.Color.WHITE);
        jButton10.setBackground(java.awt.Color.WHITE);
        jButton11.setBackground(java.awt.Color.WHITE);
        jButton12.setBackground(java.awt.Color.WHITE);

        this.getContentPane().setBackground(Color.lightGray);
        jPanel1.setBackground(Color.lightGray);
        jPanel2.setBackground(Color.lightGray);
        jPanel3.setBackground(Color.lightGray);
        jPanel4.setBackground(Color.lightGray);
        jPanel5.setBackground(Color.lightGray);
        jPanel6.setBackground(Color.lightGray);
        Inicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                arreglos.clear();
                siguiente = 0;
                puntos = 0;
                marcador.setText(Integer.toString(puntos));
                

                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            int rand = (int) (Math.random() * rango) + min;
                            int sigt = rand;
                            arreglos.add(sigt);
                            
                            switch (sigt) {
                                case 0:
                                    jButton1.setBackground(Color.red);
                                    System.out.println("caso 0");
                                    Thread.sleep(tiempo);
                                    jButton1.setBackground(Color.WHITE);
                                    break;
                                case 1:
                                    jButton2.setBackground(Color.red);
                                    System.out.println("caso 1");
                                    Thread.sleep(tiempo);
                                    jButton2.setBackground(Color.WHITE);
                                    break;
                                case 2:
                                    jButton3.setBackground(Color.red);
                                    System.out.println("caso 2");
                                    Thread.sleep(tiempo);
                                    jButton3.setBackground(Color.WHITE);
                                    break;
                                case 3:
                                    jButton4.setBackground(Color.red);
                                    System.out.println("caso 3");
                                    Thread.sleep(tiempo);
                                    jButton4.setBackground(Color.WHITE);
                                    break;
                                case 4:
                                    jButton5.setBackground(Color.red);
                                    System.out.println("caso 4");
                                    Thread.sleep(tiempo);
                                    jButton5.setBackground(Color.WHITE);
                                    break;
                                case 5:
                                    jButton6.setBackground(Color.red);
                                    System.out.println("caso 5");
                                    Thread.sleep(tiempo);
                                    jButton6.setBackground(Color.WHITE);
                                    break;
                                case 6:
                                    jButton7.setBackground(Color.red);
                                    System.out.println("caso 6");
                                    Thread.sleep(tiempo);
                                    jButton7.setBackground(Color.WHITE);
                                    break;
                                case 7:
                                    jButton8.setBackground(Color.red);
                                    System.out.println("caso 7");
                                    Thread.sleep(tiempo);
                                    jButton8.setBackground(Color.WHITE);
                                    break;
                                case 8:
                                    jButton9.setBackground(Color.red);
                                    System.out.println("caso 8");
                                    Thread.sleep(tiempo);
                                    jButton9.setBackground(Color.WHITE);
                                    break;
                                case 9:
                                    jButton10.setBackground(Color.red);
                                    System.out.println("caso 9");
                                    Thread.sleep(tiempo);
                                    jButton10.setBackground(Color.WHITE);
                                    break;
                                case 10:
                                    jButton11.setBackground(Color.red);
                                    System.out.println("caso 10");
                                    Thread.sleep(tiempo);
                                    jButton11.setBackground(Color.WHITE);
                                    break;
                                case 11:
                                    jButton12.setBackground(Color.red);
                                    System.out.println("caso 11");
                                    Thread.sleep(tiempo);
                                    jButton12.setBackground(Color.WHITE);
                                    break;

                            }
                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        repetir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                

                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            for (int i = 0; i<arreglos.size(); i++){
                             //pocision cero hasta el tamaño del arreglo - 1
                             switch (arreglos.get(i)) {
                                case 0:
                                    jButton1.setBackground(Color.red);
                                    System.out.println("caso 0");
                                    Thread.sleep(tiempo);
                                    jButton1.setBackground(Color.WHITE);
                                    break;
                                case 1:
                                    jButton2.setBackground(Color.red);
                                    System.out.println("caso 1");
                                    Thread.sleep(tiempo);
                                    jButton2.setBackground(Color.WHITE);
                                    break;
                                case 2:
                                    jButton3.setBackground(Color.red);
                                    System.out.println("caso 2");
                                    Thread.sleep(tiempo);
                                    jButton3.setBackground(Color.WHITE);
                                    break;
                                case 3:
                                    jButton4.setBackground(Color.red);
                                    System.out.println("caso 3");
                                    Thread.sleep(tiempo);
                                    jButton4.setBackground(Color.WHITE);
                                    break;
                                case 4:
                                    jButton5.setBackground(Color.red);
                                    System.out.println("caso 4");
                                    Thread.sleep(tiempo);
                                    jButton5.setBackground(Color.WHITE);
                                    break;
                                case 5:
                                    jButton6.setBackground(Color.red);
                                    System.out.println("caso 5");
                                    Thread.sleep(tiempo);
                                    jButton6.setBackground(Color.WHITE);
                                    break;
                                case 6:
                                    jButton7.setBackground(Color.red);
                                    System.out.println("caso 6");
                                    Thread.sleep(tiempo);
                                    jButton7.setBackground(Color.WHITE);
                                    break;
                                case 7:
                                    jButton8.setBackground(Color.red);
                                    System.out.println("caso 7");
                                    Thread.sleep(tiempo);
                                    jButton8.setBackground(Color.WHITE);
                                    break;
                                case 8:
                                    jButton9.setBackground(Color.red);
                                    System.out.println("caso 8");
                                    Thread.sleep(tiempo);
                                    jButton9.setBackground(Color.WHITE);
                                    break;
                                case 9:
                                    jButton10.setBackground(Color.red);
                                    System.out.println("caso 9");
                                    Thread.sleep(tiempo);
                                    jButton10.setBackground(Color.WHITE);
                                    break;
                                case 10:
                                    jButton11.setBackground(Color.red);
                                    System.out.println("caso 10");
                                    Thread.sleep(tiempo);
                                    jButton11.setBackground(Color.WHITE);
                                    break;
                                case 11:
                                    jButton12.setBackground(Color.red);
                                    System.out.println("caso 11");
                                    Thread.sleep(tiempo);
                                    jButton12.setBackground(Color.WHITE);
                                    break;

                            }

                             }
                            
                            puntos = puntos/4;
                            marcador.setText(Integer.toString(puntos));
                            
                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        //////////////////////
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 0) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));
                                    siguiente = 0;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);

                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 1) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("Primer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("Segundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("Tercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 2) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("Primer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("Segundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("Tercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 3) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 4) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE !!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 5) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 6) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 7) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 8) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 9) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 10) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setEnabled(false);
                Thread hilo = new Thread() {
                    public void run() {
                        try {
                            if (arreglos.get(siguiente) == 11) {
                                if (siguiente < arreglos.size() - 1) {
                                    siguiente++;
                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));

                                } else {
                                    if (puntos == 0) {
                                        puntos = 1;
                                    } else {
                                        puntos = puntos * 2;
                                    }

                                    marcador.setText(Integer.toString(puntos));

                                    System.out.println("Sig" + siguiente + " valor" + arreglos.get(siguiente));
                                    //tiempo=tiempo-30;
                                    int rand = (int) (Math.random() * rango) + min;
                                    int sigt = rand;
                                    //Se tiene que agregar sigt al arreglo
                                    arreglos.add(sigt);
                                    siguiente = 0;
                                    switch (sigt) {
                                        case 0:
                                            jButton1.setBackground(Color.red);
                                            System.out.println("BPrimer caso");
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.WHITE);
                                            break;
                                        case 1:
                                            jButton2.setBackground(Color.red);
                                            System.out.println("BSegundo caso");
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.WHITE);
                                            break;
                                        case 2:
                                            jButton3.setBackground(Color.red);
                                            System.out.println("BTercer caso");
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.WHITE);
                                            break;
                                        case 3:
                                            jButton4.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.WHITE);
                                            break;
                                        case 4:
                                            jButton5.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.WHITE);
                                            break;
                                        case 5:
                                            jButton6.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.WHITE);
                                            break;
                                        case 6:
                                            jButton7.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.WHITE);
                                            break;
                                        case 7:
                                            jButton8.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.WHITE);
                                            break;
                                        case 8:
                                            jButton9.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.WHITE);
                                            break;
                                        case 9:
                                            jButton10.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.WHITE);
                                            break;
                                        case 10:
                                            jButton11.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.WHITE);
                                            break;
                                        case 11:
                                            jButton12.setBackground(Color.red);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.WHITE);
                                            break;

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "PERDISTE!! INTENTA DE NUEVO");
                            }

                        } catch (InterruptedException ex) {

                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        marcador = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Inicio = new javax.swing.JButton();
        repetir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        marcador.setEditable(false);
        marcador.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(marcador)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(marcador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Inicio.setText("A JUGAR!!");

        repetir.setText("OTRA VEZ!!");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(repetir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(repetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JUEGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JUEGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JUEGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JUEGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JUEGO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField marcador;
    private javax.swing.JButton repetir;
    // End of variables declaration//GEN-END:variables
}
