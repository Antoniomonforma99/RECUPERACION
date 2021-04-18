import { Injectable } from '@angular/core';
import { AngularFirestore, AngularFirestoreDocument } from '@angular/fire/firestore';
import { Router } from '@angular/router';
import { Poi } from '../models/poi.interface';

@Injectable({
  providedIn: 'root'
})
export class PoiService {

  constructor(private afs: AngularFirestore,
    private router: Router) { }

  updatePoi(poi) {
    // Sets user data to firestore on login
    const userRef: AngularFirestoreDocument<Poi> = this.afs.doc(`pois/${poi.id}`);
    userRef.set(poi, { merge: true });
    this.router.navigate(['/pois']);
  }
}
