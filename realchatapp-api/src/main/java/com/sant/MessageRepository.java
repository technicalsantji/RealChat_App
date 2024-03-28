/**
 * @author santji
 * @date 27-Mar-2024
 */
package com.sant;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 */
public interface MessageRepository extends JpaRepository<Message, Long> {

}
