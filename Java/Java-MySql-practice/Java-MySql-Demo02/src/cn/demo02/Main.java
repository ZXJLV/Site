package cn.demo02;

import cn.demo02.service.PatientService;
import cn.demo02.service.impl.PatientServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        PatientService patientService = new PatientServiceImpl();

        System.out.println("请问您是医生还是患者（1.医生2.患者）");
        int doctorOrPatient = input.nextInt();

        while (doctorOrPatient != 1 && doctorOrPatient != 2) {
            System.out.println("请输入“1”或“2”");
            doctorOrPatient = input.nextInt();
        }

        switch (doctorOrPatient) {
            case 1:
                System.out.println("1.叫号\t2.诊断");
                int doctor = input.nextInt();

                while (doctor != 1 && doctor != 2) {
                    System.out.println("请输入“1”或“2”");
                    doctor = input.nextInt();
                }

                switch (doctor) {
                    case 1:
                        //叫号
                        patientService.updatePatientState();
                        break;
                    case 2:
                        //诊断
                        patientService.updatePatientState2();
                        break;
                }
                break;
            case 2:
                System.out.println("1.挂号\t2.打印挂号信息");
                int patient = input.nextInt();

                while (patient != 1 && patient != 2) {
                    System.out.println("请输入“1”或“2”");
                    patient = input.nextInt();
                }

                switch (patient) {
                    case 1:
                        //挂号
                        patientService.insertPatient();
                        break;
                    case 2:
                        //打印挂号信息
                        patientService.selectPatient();
                        break;
                }
                break;
        }











    }
}