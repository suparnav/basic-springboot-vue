import axios from "axios";

const STUDENT_API_LINK = 'http://localhost:9000/api/students'

class StudentService {
    getStudentDetails() {
        return axios.get(STUDENT_API_LINK);
    }
}

export default new StudentService();