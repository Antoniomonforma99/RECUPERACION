import { Component, Input, OnInit } from '@angular/core';
import { Movie } from 'src/app/models/movie.interface';
import { MoviesService } from 'src/app/services/movies.service';


@Component({
  selector: 'app-movies-list',
  templateUrl: './movies-list.component.html'
})
export class MoviesListComponent implements OnInit {
  @Input()
  get color(): string {
    return this._color;
  }
  set color(color: string) {
    this._color = color !== "light" && color !== "dark" ? "light" : color;
  }
  private _color = "light";
  @Input() title;

  moviesList = [];

  constructor(private moviesService: MoviesService) {}

  ngOnInit(): void {
    this.moviesService.getMovies().subscribe(resp => {
      this.moviesList = resp.map(e => {
        return e.payload.doc.data() as Movie;
      });
    });
  }
}
