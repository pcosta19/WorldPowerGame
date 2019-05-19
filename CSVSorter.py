import csv

with open("/Users/a/Downloads/qgdpstate0519_3.csv", 'r+') as file:
    read = csv.reader(file, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
    row = 0
    states = []
    GDPs = []
    for i in read:
        row+=1
        if row > 7 and row < 66 and row != 14 and row != 21 and row != 27 and row != 35 and row != 48 and row != 53 and row != 59:
            GDPs.append(i[8].replace(',', ""))
            states.append(i[0].lower().replace(" ", ""))
    dictionary = dict(zip(states, GDPs))
    states_GDPs = []
    for key in sorted(dictionary):
        states_GDPs.append([key, dictionary[key]])
    file.close()
with open("/Users/a/eclipse-workspace/WorldPowerGame-master/Sorted_GDPs.csv", 'w') as f:
    write = csv.writer(f, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
    for row in states_GDPs:
        write.writerow(row)
    f.close()

with open("/Users/a/Downloads/State_HDI.csv", 'r+') as f:
    read = csv.reader(f, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
    row = 0
    states = []
    HDI = []
    for i in read:
        row+=1
        if row > 3:
            states.append(i[2].lower().replace(" ", ""))
            HDI.append(i[3])
    dictionary = dict(zip(states, HDI))
    states_HDIs = []
    for key in sorted(dictionary):
        states_HDIs.append([key, dictionary[key]])
    f.close()
with open("/Users/a/eclipse-workspace/WorldPowerGame-master/Sorted_HDIs.csv", 'w') as f:
    write = csv.writer(f, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
    for row in states_HDIs:
        write.writerow(row)
    f.close()

with open("/Users/a/Downloads/Unsorted_Area.csv", 'r+') as f1:
    read = csv.reader(f1, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
    row = 0
    states = []
    Area = []
    for i in read:
        row+=1
        if row > 1:
            states.append(i[1].lower().replace(" ", ""))
            a = i[2].replace(',', "")
            Area.append(a)
    dictionary = dict(zip(states, Area))
    states_Areas = []
    for key in sorted(dictionary):
        states_Areas.append([key, dictionary[key]])
    f1.close()
with open("/Users/a/Documents/Sorted_Areas.csv", 'w') as f2:
    write = csv.writer(f2, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
    for row in states_Areas:
        write.writerow(row)
    f2.close()