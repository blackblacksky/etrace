package io.etrace.api.repository;

import io.etrace.api.model.po.ui.Node;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface NodeMapper extends PagingAndSortingRepository<Node, Long> {

    Node findByGlobalId(String globalId);

    int countByTitleContainingAndGlobalIdAndStatusAndCreatedByOrUpdatedBy(String title, String globalId, String status,
                                                                          String create, String update);

    List<Node> findByTitleContainingAndGlobalIdAndStatusAndCreatedByOrUpdatedBy(String title, String globalId,
                                                                                String status, String create,
                                                                                String update, Pageable page);

    List<Node> findByTitleContainingAndIdIn(String title, List<Long> id);

    @Query("UPDATE node   SET viewCount = (viewCount + 1)       WHERE id = ?1")
    @Modifying
    void updateUserFavorite(Long id);

    @Query("UPDATE node   SET viewCount = (viewCount + 1)       WHERE id = ?1")
    @Modifying
    void updateUserView(Long id);

    @Query("UPDATE node   SET favoriteCount = (favoriteCount - 1)      WHERE id = ?1")
    @Modifying
    void deleteUserFavorite(Long id);
}
