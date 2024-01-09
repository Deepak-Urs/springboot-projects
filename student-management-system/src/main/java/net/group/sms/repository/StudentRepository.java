package net.group.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.group.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
