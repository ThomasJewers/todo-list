import todo.Task;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean flag = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<Task>();
        String DeStatus = "Incomplete";
        while (flag) {
            System.out.println("Select Action: ");
            System.out.println("1. Add Task 2. Edit Task 3. Mark Complete 4. Delete Task 5. List Tasks");
            int Action = scan.nextInt();
            scan.nextLine();
            if (Objects.equals(Action, 1)) {
                System.out.println("Enter the task title: ");
                String Title = scan.nextLine();
                System.out.println("Enter the due date: ");
                String Date = scan.nextLine();
                System.out.println("Enter the description: ");
                String Desc = scan.nextLine();
                tasks.add(new Task(Title, Date, DeStatus, Desc));
                System.out.println("Task added.");
                System.out.println();
            } else if (Objects.equals(Action, 2)) {
                System.out.println("Type task number to edit");
                int edit = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter the new title: ");
                String Title = scan.nextLine();
                System.out.println("Enter the new due date: ");
                String Date = scan.nextLine();
                System.out.println("Enter the new description: ");
                String Desc = scan.nextLine();
                tasks.remove(edit);
                tasks.add(edit, new Task(Title, Date, DeStatus, Desc));
                System.out.println("Task updated.");
                System.out.println();
            } else if (Objects.equals(Action, 3)) {
                System.out.println("Type task number to complete or incomplete");
                int stat = scan.nextInt();
                scan.nextLine();
                if (Objects.equals(tasks.get(stat).Status, "Incomplete")) {
                    tasks.get(stat).Status = "Complete";
                } else {
                    tasks.get(stat).Status = "Incomplete";
                }

            } else if (Objects.equals(Action, 4)) {
                System.out.println("Type task number to delete");
                int delete = scan.nextInt();
                scan.nextLine();
                tasks.remove(delete);
                System.out.println("Task deleted.");
                System.out.println();
            } else if (Objects.equals(Action, 5)) {
                for (Task i : tasks) {
                    System.out.println("Task #" + tasks.indexOf(i));
                    System.out.println("Title: " + i.Title);
                    System.out.println("Description: " + i.Desc);
                    System.out.println("Status: " + i.Status);
                    System.out.println("Due Date: " + i.Date);
                    System.out.println();
                }
            } else {
                System.out.println("Incorrect Action");
                System.out.println();
            }
        }
    }
}