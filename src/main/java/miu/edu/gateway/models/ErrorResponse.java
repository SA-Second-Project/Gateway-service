package miu.edu.gateway.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse implements Serializable {
    private Date timestamp;
    private int status;
    private String error;
    private List<String> details;
    private String path;
}