/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hxt.repository;

import com.hxt.pojo.Comment;
import java.util.List;

/**
 *
 * @author vutrongthang
 */
public interface CommentRepository {
    List<Comment> getComments(int admissionId);
    boolean addComment(Comment c);
}
