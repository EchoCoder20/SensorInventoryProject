 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SensorService {
    static List<Sensors> sensorsList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static List<Sensors> getSensorsList() {
        return sensorsList;
    }

    public static void setSensorsList(List<Sensors> sensorsList) {
        SensorService.sensorsList = sensorsList;
    }

    public static void displayAllItem() {
        if (sensorsList.isEmpty()) {
            System.out.println("No sensors products added on your list");
        } else {
            System.out.println("The list of sensors you added");

            for (Sensors sensor : sensorsList) {
                System.out.println("Sensor Name" + ":" + sensor.getName() + "\n Price : " + sensor.getPrice() + "\n Quantity: " + sensor.getQuantity());

            }
        }
    }

    public static void removeItem() {
        if (sensorsList.isEmpty()) {
            System.out.println("No sensors products added on your list");
        } else {
            scanner.nextLine();
            System.out.print("Enter the name of the sensor to remove: ");
            String sensorName = scanner.nextLine();
            if (checkIfSensorNameExit(sensorName)) {
                sensorsList.removeIf(c -> c.getName().equals(sensorName));
                System.out.println("The sensor with name: (" + sensorName + " )removed successfully!");
            }else {
                System.out.println("No sensor with this name !");
            }
        }

    }

    public static void editItem() {
        if(sensorsList.isEmpty()) {
            System.out.println("No sensors products added on your list");
        }else {
//            scanner.nextLine();
            System.out.print("Enter the sensor name you want to edit : ");
            String sensorName=scanner.nextLine();
            if(checkIfSensorNameExit(sensorName))
            {
                String oldSensorName=sensorName;
                Float oldPrice= 0.0F;
                int oldQuantity=0;
                for(Sensors sensor: sensorsList){
                    if(sensor.getName().equals(sensorName)){
                        oldPrice=sensor.getPrice();
                        oldQuantity=sensor.getQuantity();
                    }
                }

                System.out.println("Edit the sensor name, you can click (enter) if not want to edit ");
                String newSensorName=scanner.nextLine();
                if(checkIfSensorNameExit(newSensorName) || newSensorName ==null || newSensorName.isEmpty() || newSensorName.isBlank())
                {
                    newSensorName=sensorName;
                }
                System.out.println("Edit the sensor price, you can click (enter) if not want to edit ");
                String priceInput = scanner.nextLine();
                Float newSensorPrice=null;
                if(priceInput.isEmpty())
                {
                    newSensorPrice=oldPrice;
                }
                else{
                    newSensorPrice=Float.parseFloat(priceInput);
                }
                System.out.println("Edit the sensor quantity, you can click (enter) if not want to edit ");
                String quantityInput = scanner.nextLine();
                Integer newSensorQuantity=null;
                if(quantityInput.isEmpty() || Integer.parseInt(quantityInput)<0)
                {
                    newSensorQuantity=oldQuantity;
                }
                else{
                    newSensorQuantity=Integer.parseInt(quantityInput);
                }

                String finalNewSensorName = newSensorName;
                Float finalNewSensorPrice = newSensorPrice;
                Integer finalNewSensorQuantity = newSensorQuantity;
                sensorsList.forEach(sensors -> {
                    if(sensors.getName().equals(sensorName))
                    {
                        sensors.setName(finalNewSensorName);
                        sensors.setPrice(finalNewSensorPrice);
                        sensors.setQuantity(finalNewSensorQuantity);
                    }

                });
                System.out.println("Sensor Edited Successfully !!");

            }else {
                System.out.println("No Sensor with this name!!");
            }
        }
    }

    public static void addingNewItem() {
        boolean flag = true;
        while (flag) {
            Sensors newSensor = new Sensors();

            System.out.println("Enter the id of the sensor");
            int sensorId = scanner.nextInt();
            if (sensorId < 0 || checkIfSensorIdExit(sensorId)) {
                System.out.println("Invalid sensor id, try again !!");

            } else {
                newSensor.setId(sensorId);
                System.out.println("Enter sensor name");
                scanner.nextLine();
                String sensorName = scanner.nextLine();
                while (sensorName == null || sensorName.isEmpty() || sensorName.isBlank() || checkIfSensorNameExit(sensorName)) {
                    System.out.println("Be sure that sensor name it must not be null, empty or blank and it must not be already exist, enter it again");
                    sensorName = scanner.nextLine();
                }

                newSensor.setName(sensorName);
                System.out.println("Enter sensor price");
                float sensorPrice = scanner.nextFloat();
                while (sensorPrice < 0) {
                    System.out.println("Price value is not valid, enter it again");
                    sensorPrice = scanner.nextFloat();
                }
                newSensor.setPrice(sensorPrice);
                System.out.println("Enter the quantity of the sensor");
                int sensorQuantity = scanner.nextInt();
                if (sensorQuantity < 0)
                    newSensor.setQuantity(0);
                newSensor.setQuantity(sensorQuantity);
                scanner.nextLine();
                sensorsList.add(newSensor);
                System.out.println("Sensor successfuly Added");
                System.out.println("Do you want to continue adding new sensor ? (Y/N)");
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("N"))
                    flag = false;


            }

        }
    }

    public static boolean checkIfSensorNameExit(String sensorName) {
        for (Sensors sensor : sensorsList) {
            if (sensor.getName().equals(sensorName))
                return true;
        }
        return false;
    }

    public static boolean checkIfSensorIdExit(Integer sensorId) {
        for (Sensors sensor : sensorsList) {
            if (sensor.getId().equals(sensorId))
                return true;
        }
        return false;
    }

}
