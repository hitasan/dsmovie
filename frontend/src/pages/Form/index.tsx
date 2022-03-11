import FormCard from "components/FormCard";
import { useParams } from "react-router-dom";

function Form(){

    const params = useParams(); // Pega os parametros que vieram pela requisição 
    
    // Repassando para o formCard o ID recebido dos parametros
    return(
        <FormCard movieId={`${params.movieId}`}/>
    );
}

export default Form;