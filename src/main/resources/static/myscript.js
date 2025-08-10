function showavailableCourses(){
    fetch("http://localhost:8080/courses")
    .then((response)=> response.json())
    .then((courses)=>{


        const dataTable =document.getElementById("courseTable");

        courses.forEach(course => {
            var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>   
            <td>${course.trainer}</td>
            <td>${course.durationInWeeks}</td>
            </tr>`

            dataTable.innerHTML += row;

        });
    });
 
}