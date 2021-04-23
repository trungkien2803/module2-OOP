package com.company;

import java.util.*;

public class LibararyManagement {
    private List<Document> documentLists = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void addDocument(Document e) {
        documentLists.add(e);
    }

    public void displayDocumentLists() {
        for (Object e : documentLists) {
            if (e instanceof Book) {
                ((Book) e).displayBookInfo();
            } else if (e instanceof Journal) {
                ((Journal) e).displayJournalInfo();
            } else if (e instanceof Newspaper) {
                ((Newspaper) e).displayNewspaperInfo();
            }
        }
    }

    public void findDocument() {
        int choice = -1;
        do {
            System.out.println("1. Tìm theo sách");
            System.out.println("2. Tìm theo tạp chí");
            System.out.println("3. Tìm theo báo");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    for (Object e : documentLists) {
                        if (e instanceof Book) {
                            ((Book) e).displayBookInfo();
                        }
                    }
                    break;
                }
                case 2: {
                    for (Object e : documentLists) {
                        if (e instanceof Journal) {
                            ((Journal) e).displayJournalInfo();
                        }
                    }
                    break;
                }
                case 3: {
                    for (Object e : documentLists) {
                        if ((e instanceof Newspaper)) {
                            ((Newspaper) e).displayNewspaperInfo();
                        }
                    }
                    break;
                }

            }
        } while (choice != 0);
    }

    public void findId(String id) {
        sortId();
        int low = 0;
        int high = documentLists.size() - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (id.charAt(0) < documentLists.get(mid).getDocumentId().charAt(0))
                high = mid - 1;
            else if (id.equals(documentLists.get(mid).getDocumentId())) {
                if (documentLists.get(mid) instanceof Book) {
                    ((Book) documentLists.get(mid)).displayBookInfo();
                } else if (documentLists.get(mid) instanceof Journal) {
                    ((Journal) documentLists.get(mid)).displayJournalInfo();
                } else if (documentLists.get(mid) instanceof Newspaper) {
                    ((Newspaper) documentLists.get(mid)).displayNewspaperInfo();
                }
                break;
            } else
                low = mid + 1;
        }
    }

    public void sort() {
        for (int i = 1; i < documentLists.size(); i++) {
            int pos = i;
            char temp = documentLists.get(i).getImprint().charAt(0);

            while (pos > 0 && temp < documentLists.get(pos - 1).getImprint().charAt(0)) {
                Collections.swap(documentLists, pos, pos - 1);
                pos--;
            }
        }
    }

    public void sortId() {
        for (int i = 1; i < documentLists.size(); i++) {
            int pos = i;
            char temp = documentLists.get(i).getDocumentId().charAt(0);
            while (pos > 0 && temp < documentLists.get(pos - 1).getDocumentId().charAt(0)) {
                Collections.swap(documentLists, pos, pos - 1);
                pos--;
            }
        }
    }

}
