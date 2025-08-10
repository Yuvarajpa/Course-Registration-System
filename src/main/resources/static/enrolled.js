function showenrolledCourses(){
    fetch("http://localhost:8080/admin/courses/enrolled")
    .then((response) => response.json())
    .then((enrolled)=>{

      const studentCount = document.getElementById("studentCount");
      studentCount.textContent = `Total Enrolled Students: ${enrolled.length}`;

        const dataTable=document.getElementById("enrolledTable");


    enrolled.forEach(enrol => {
        var row =`<tr>
        <td>${enrol.name}</td>
        <td>${enrol.emailId}</td>
        <td>${enrol.courseName}</td>
        </tr>`
        dataTable.innerHTML += row;
    });
    });
}