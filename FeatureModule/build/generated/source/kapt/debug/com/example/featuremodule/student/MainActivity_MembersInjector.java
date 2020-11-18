// Generated by Dagger (https://google.github.io/dagger).
package com.example.featuremodule.student;

import com.example.daggersample.student.Student;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Student> studentProvider;

  public MainActivity_MembersInjector(Provider<Student> studentProvider) {
    this.studentProvider = studentProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<Student> studentProvider) {
    return new MainActivity_MembersInjector(studentProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectStudent(instance, studentProvider.get());
  }

  public static void injectStudent(MainActivity instance, Student student) {
    instance.student = student;
  }
}
