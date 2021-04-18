import { Injectable } from '@angular/core';
import { AngularFireStorage } from '@angular/fire/storage';

@Injectable({
  providedIn: 'root'
})
export class FileService {

  constructor(
    private storage: AngularFireStorage
  ) { }

  //subir archivo
  public uploadFileCloudStorage(fileName: string, data: any) {
    return this.storage.upload(fileName, data);
  }

  //Referencia del archivo
  public getFileCloudStorage(fileName: string) {
    return this.storage.ref(fileName);
  }
}
