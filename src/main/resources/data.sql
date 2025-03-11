INSERT INTO album (name, release_date) VALUES ('Album A', '2022-01-01');
INSERT INTO album (name, release_date) VALUES ('Album B', '2023-02-10');

INSERT INTO artist (name, genre) VALUES ('Artist X', 'Pop');
INSERT INTO artist (name, genre) VALUES ('Artist Y', 'Rock');

-- Chú ý: Nếu DB trống, cột id sẽ tự tăng
-- Để tham chiếu album_id = 1, artist_id = 1,... tuỳ theo DB
INSERT INTO song (title, quality, album_id, artist_id) VALUES ('Song 1', '320kbps', 1, 1);
INSERT INTO song (title, quality, album_id, artist_id) VALUES ('Song 2', 'FLAC', 1, 2);
INSERT INTO song (title, quality, album_id, artist_id) VALUES ('Song 3', '320kbps', 2, 1);
