import requests
import csv
from bs4 import BeautifulSoup

URL = 'http://www.shanghairanking.com/ARWU2019.html'
page = requests.get(URL)
soup = BeautifulSoup(page.content, 'html.parser')
results1 = soup.table.find_all('tr',class_ = ["bgfd" , "bgf5"])
results2 = soup.table.find_all(class_ = "bgf5")
a=[]
i=0
b=[]
for job_elem in results1:
    a= job_elem.text.strip()
    list1 = [char for char in a]
    c=""
    for i in range(len(a)):
        c=c+a[i]
        if i<len(a)-1:
            if a[i].isdigit() and a[i+1].isalpha():
                c=c+","

        if (a[i].isalpha() or a[i]==(")") or a[i]==(" ")) and a[i+1].isdigit():
            break
    b.append(c)

with open('output.csv',  "w") as csvfile:
    writer = csv.writer(csvfile)
    for i in range( len(b)):
        writer.writerow([b[i]])
        
 
    

