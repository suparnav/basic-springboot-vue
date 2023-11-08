<template>
    <div class = 'container'>
        <h1 class="text-center"> Student</h1>
        <table class = "table table-striped">
            <thead>
                <th>Student Id</th>
                <th>First name</th>
                <th>Last Name</th>
                <th>Email Id</th>
            </thead>
            <tbody>
                <tr v-for="student in student_details" v-bind:key="student.id">
                    <td>{{ student.id }}</td>
                    <td>{{ student.firstName }}</td>
                    <td>{{ student.lastName }}</td>
                    <td>{{ student.email }}</td>

                </tr>
            </tbody>
        </table>
    </div>
</template>
<script>
import StudentService from '@/services/StudentService';
 export default{
    name:'Student_Details',
    data(){
        return {
            student_details:[]
        }
        
    },
    methods:{
         getStudentDetails() {
            
            StudentService.getStudentDetails().then(
                response => {
                this.student_details=response.data;
            }
            );

           
        }
    },
    created(){
        this.getStudentDetails()
    }
}
</script>
